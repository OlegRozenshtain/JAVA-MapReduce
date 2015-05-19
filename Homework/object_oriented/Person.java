package object_oriented;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Ex1: write a class that represents a Person, containing an id, name and birthday
 * Ex2: implement the setter/getter methods
 * Ex3: implement at least two constructors
 * Ex4: implement a method for printing out the person's details
 */
public class Person 
{
	protected int m_id;
	protected String m_name;
	protected Date m_birthday;
	
	final static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public Person()
	{
		m_id = -1;
		m_name = null;
		m_birthday = null;
	}
	
	public Person(int id, String name) 
	{
		this();
		this.setId(id);
		this.setName(name);
	}
	
	public Person(int id, String name, String birthday) 
	{
		this(id, name);
		this.setBirthday(birthday);
	}
	
	// copy constructor
	public Person(Person p)
	{
		this(p.getId(), p.getName(), df.format(p.getBirthday()));
	}

	public int getId() 
	{
		return m_id;
	}
	
	public void setId(int id) 
	{
		if(id > 0)
		{
			m_id = id;
		}
		else
		{
			System.out.println("id must be a positive number");
		}
	}
	
	public String getName() 
	{
		return m_name;
	}
	public void setName(String name) 
	{
		m_name = name;
	}
	
	public Date getBirthday() 
	{
		return m_birthday;
	}
	
	public void setBirthday(String birthday) 
	{
		try 
		{
			m_birthday = df.parse(birthday);
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString()
	{
		StringBuffer stringRepresentation = new StringBuffer();
		
		if(getId() == -1)
		{
			stringRepresentation.append("illigal ID\n");
		}
		else
		{
			stringRepresentation.append("My ID is: " + m_id + "\n");
		}
		stringRepresentation.append("My name is: " + m_name + "\n");
		stringRepresentation.append("My birthday is: " + df.format(m_birthday) + 
									"\n");
		
		return stringRepresentation.toString();
	}
	
	public void printDetails()
	{
		System.out.println(toString());
	}
	
	public static Person createPerson()
	{
		Scanner input = new Scanner(System.in);
		int id = 0;
		String name;
		String birthday;
		
		System.out.println("please enter ID number");
		id = Integer.parseInt(input.nextLine());
		System.out.println("please enter name");
		name = input.nextLine();
		System.out.println("please enter birthday as dd/mm/yyyy");
		birthday = input.nextLine();
		
		return new Person(id, name, birthday);
	}
}
