package object_oriented;

/**
 * Ex1: implement class Teacher inheriting from the Person class, add additional  
 *      fields for salary and years of experience
 * Ex2: implement the relevant setters/getters, constructors and printing methods
 * Ex3: implement the toString and equals methods
 */
public class Teacher extends Person 
{
	private float m_salary = -1;
	private float m_yearsExperience = 0;
	
	public Teacher()
	{
		super();
	}
	
	public Teacher(int id, String name, String birthday, float salary, 
				   float yearsExperience) 
	{
		super(id, name, birthday);
		setSalary(salary);
		setYearsExperience(yearsExperience);
	}

	public float getSalary() 
	{
		return m_salary;
	}

	public void setSalary(float salary) 
	{
		if(salary >= 0)
		{
			m_salary = salary;
		}
	}

	public float getYearsExperience() 
	{
		return m_yearsExperience;
	}

	public void setYearsExperience(float yearsExperience) 
	{
		if(yearsExperience >= 0)
		{
			m_yearsExperience = yearsExperience;
		}
	}
	
	// no need to override printDetails(). prints correct details through 
	// overriding toString()
//	@Override
//	public void printDetails()

	@Override
	public String toString() 
	{
		StringBuffer stringRepresentation = new StringBuffer(super.toString());
		
		stringRepresentation.append("My salary is: " + getSalary() + "\n");
		stringRepresentation.append("I have : " + getYearsExperience() + 
				   					" years of experience\n");
		
		return stringRepresentation.toString();
	}

	@Override
	public boolean equals(Object rhs)
	{
		Teacher other = (Teacher) rhs;
		
		if((getSalary() == other.getSalary()) &&
		   (getYearsExperience() == other.getYearsExperience()))
		{
			return true;
		}
		
		return false;
	}
}
