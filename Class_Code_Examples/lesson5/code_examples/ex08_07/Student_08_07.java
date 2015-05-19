// Filename: "Student_08_07.java"
// Program : a general purpose Student class

package lesson5.code_examples.ex08_07;

public class Student_08_07
{
    String name;
    int age;
    int average;
    
    public Student_08_07(String name, int age)
    {
        this(name, age, 0);
    }
    
    public Student_08_07(String name, int age, int average)
    {
        setAll(name, age, average);
    }
    
    public void setAll(String name, int age, int average)
    {
        setName(name);
        setAge(age);
        setAverage(average);
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
        
    public void setAverage(int average)
    {
        this.average = average;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
        
    public int getAverage()
    {
        return average;
    }
    
    @Override
    public String toString()
    {
        return "Student: " + name + ", " + age + ", Average: " + average;        
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
