package lesson4.day4_code_examples;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestAll {
	
	public static void doPrint(Printable p) throws IOException {
		
		p.print();
	}
	
	public static void doPrintDetails(Shape s) {
		
		s.printDetails();
	}
		
	public static void main(String[] args) throws IOException {
		
		Circle circle = new Circle();
		Square square = new Square();
		
		// Shape s1 = new Shape(); //not allowed - shape is an abstract class
		Shape s1;
		Shape s2;
		
		// Explicit up-casting of Circle to Shape - Circle is-A Shape
		s1 = (Shape)circle;
		// Implicit up-casting of Square to Shape - Square is-A Shape
		s2 = square;
		
		// Explicit down-casting of Shape (s2) to Square - Square is-A square - OK
		Square square2 = (Square)s2;
		
		// Square square3 = s2; // implicit Down-casting yields a compile time error - Shape is-Not-A Square 
		// Square square4 = (Square)s1; // explicit Down-casting yields a runtime error - mismatch - Circle is-Not-A Square
		
		Invoice inv = new Invoice( "Invoice for Sale", "Total: 345$", "End of Invoice" );
		
		doPrintDetails(s1);
		doPrint(inv);
		
		Printable[] printables = new Printable[4];
		
		for( int i = 0; i<printables.length; i++ ) {
			
			System.out.println(printables[i]);
		}	
		
		File file = new File( "in.txt" );
		
		PrintWriter pw = new PrintWriter( file );
		pw.println( "1st Line" );
		pw.println( "2nd Line" );
		pw.println( "3rd Line" );		
		pw.close();
		
		printables[0] = new Circle();
		printables[1] = new Square();
		printables[2] = new Invoice( "Invoice for Sale", "Total: 345$", "End of Invoice" );
		printables[3] = new TextFile( file );
		
		for ( int i = 0; i<printables.length; i++ ) {
			
			printables[i].print();
		}		
	}
}