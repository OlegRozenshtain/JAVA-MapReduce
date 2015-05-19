package object_oriented;

/**
 * Ex1: implement class Student inheriting from the Person class, add an 
 *      additional field for final average grade
 * Ex2: implement the relevant setters/getters, constructors and printing methods
 * Ex3: implement the toString and equals methods
 */
public class Student extends Person 
{
	private float m_averageGrade = -1;

	public Student()
	{
		super();
	}

	public Student(int id, String name, String birthday) 
	{
		super(id, name, birthday);
	}

	public float getAverageGrade() 
	{
		// some logic to calculate the average out of the grades
		return m_averageGrade;
	}

	// no setter for average because it is a calculated field
//	public void setAverageGrade(float m_averageGrade) 
//	{
//	}
	
	// no need to override printDetails(). prints correct details through 
	// overriding toString()
//	@Override
//	public void printDetails()

	@Override
	public String toString() 
	{
		StringBuffer stringRepresentation = new StringBuffer(super.toString());
		
		stringRepresentation.append("My average is: " + getAverageGrade() + "\n");
		
		return stringRepresentation.toString();
	}
	
	@Override
	public boolean equals(Object rhs)
	{
		Student other = (Student) rhs;
		
		if(getAverageGrade() == other.getAverageGrade())
			return true;
		
		return false;
	}
}