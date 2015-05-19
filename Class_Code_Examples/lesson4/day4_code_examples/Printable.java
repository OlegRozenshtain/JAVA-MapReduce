package lesson4.day4_code_examples;

import java.io.IOException;
//tagging interface - this is just to show how to use "extends" with interfaces
import java.io.Serializable; 

// implementing this interface is a contract to implement the print method
// meaning an object of the implementing class can be printed,
// or else it is a type of an abstract class
public interface Printable extends Serializable {

	void print() throws IOException;
}
