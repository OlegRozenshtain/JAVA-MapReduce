// Filename: "DeserializeTest.java"
// Version : "P.3"

import java.io.*;

public class DeserializeTest
{
	public static void main(String[] args) 
	{
		Student retrievedStudent1 = null;
		Student retrievedStudent2 = null;
		
		try 
		{
			FileInputStream fileIn = new FileInputStream("./ser/students.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			retrievedStudent1 = (Student) objectIn.readObject();
			retrievedStudent2 = (Student) objectIn.readObject();
			objectIn.close();
			fileIn.close();
		}
		
		catch (IOException e) 
		{
			e.printStackTrace();
			return;
		}
		
		catch (ClassNotFoundException e) 
		{
			System.out.println("Can't find Student class definition");
			e.printStackTrace();
			return;
		}
		
		System.out.println("Deserialized Student: ");
		System.out.println("*********************");
		System.out.println("Name: " + retrievedStudent1.getName());
		System.out.println("Address: " + retrievedStudent1.getAddress());
		System.out.println("Local ID: " + retrievedStudent1.getLocalID());
		
		System.out.println();
		
		System.out.println("Deserialized Student: ");
		System.out.println("*********************");
		System.out.println("Name: " + retrievedStudent2.getName());
		System.out.println("Address: " + retrievedStudent2.getAddress());
		System.out.println("Local ID: " + retrievedStudent2.getLocalID());
		retrievedStudent2.sendGradesReport();
	}
}

/****************************************************************
 * (C) Copyright by Moran Alkobi, http://moranalkobi.com        *
 ****************************************************************
 * Disclaimer: The author of the sourcecodes and presentations  *
 * has done his best to provide you with good explanations      *
 * and examples to allow you an educational and beneficial      *
 * walk through over the materials of the class.                *
 * With that said, the author makes no warranty of any kind,    *
 * expressed or implied, with regard to these programs or to    *
 * the documentation contained in his lectures and sourcecodes. *
 * The author shall not be held responsible in any way in event *
 * of any incidental or consequential damages arising out of    *
 * the use of these materials.                                  *
 ****************************************************************/