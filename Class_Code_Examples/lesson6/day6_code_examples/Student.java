// Filename: "Student.java"
// Version : "P.1"

public class Student implements java.io.Serializable
{
	private String name;
	private String address;
	private transient int localID;
	private static final long serialVersionUID = -2307100901176594383L;
	
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public int getLocalID() 
	{
		return localID;
	}

	public void setLocalID(int localID) 
	{
		this.localID = localID;
	}
	
	public void sendGradesReport() 
	{
		System.out.println("Grades report sent to " + getName() + ", " + getAddress());
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