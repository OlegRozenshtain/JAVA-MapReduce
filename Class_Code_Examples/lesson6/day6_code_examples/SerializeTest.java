// Filename: "SerializeTest.java"
// Version : "P.2"

import java.io.*;

public class SerializeTest
{
	public static void main(String[] args) 
	{
		// create a folder to store serialized objects 
		File serDir = new File("./ser");
		serDir.mkdir();
		
		Student student1 = new Student();
		student1.setName("Benni Gal");
		student1.setAddress("Haifa, 10 Ha-Nassich st.");
		student1.setLocalID(12345);
		
		Student student2 = new Student();
		student2.setName("Yaron Shalem");
		student2.setAddress("Ariel, 5 Ha-Nassi st.");
		student2.setLocalID(12345);

		try 
		{
			FileOutputStream fileOut = new FileOutputStream("./ser/students.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(student1);
			objectOut.writeObject(student2);
			objectOut.close();
			fileOut.close();
			System.out.printf("Serialized data saved.\nTo retrieve data, deserialize ./students.ser");
		}

		catch (IOException e) 
		{
			e.printStackTrace();
		}
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