// Filename: "StudentComparator_08_07.java"
// Program : implementation of the Comparator interface for comparing Student objects
// using the Comparator< T > generic version. 

package lesson5.code_examples.ex08_07;

import java.util.Comparator;

// NOTICE: here we are implementing Comparator < T > so we will be forced to override
// compare() so that it will take two T (Student) parameters, rather than implementing
// Comparator and having compare() to take two general Object objects. 
class StudentComparator_08_07 implements Comparator < Student_08_07 >
{
    // compare should return a negative/positive/zero if
    // s1 is smaller/bigger than or equal to s2 accordingly.
    // the sort algorithm will then take the value and according to it,
    // sort the objects in the right order.
    @Override
    public int compare(Student_08_07 s1, Student_08_07 s2)
    {
        return s1.average-s2.average;
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