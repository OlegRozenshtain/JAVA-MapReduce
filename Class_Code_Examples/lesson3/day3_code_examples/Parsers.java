package lesson3.day3_code_examples;

public class Parsers {
	
	public static int parseInt(String s) {
		
		char[] c = s.toCharArray();
		
		int number=0;
		
		for(int i = c.length-1, mul = 1 ; i>=0 ; i--, mul*=10) {
			
			number=number+(Character.getNumericValue(c[i])*mul);
		}
		
		return number;
	}
	
	
	// THE FOLLOWING HAS NOTHIG TO DO WITH THE PARSERS CLASS
	// IT IS JUST TO DEMONSTRATE METHOD OVERLOADING
	
	String name;
	int x;
	
	// method Overloading
	public Parsers() {
		name = "default name";
	}
	
	// method Overloading	
	public Parsers(String string) {
		name = string;
	}
	
	// method Overloading
	public Parsers(int x) {
		this.x = x;
	}
	
	// method Overloading
	public Parsers(int number, int number2) {
		x = number+number2;
	}
	
	// method Overloading
	public Parsers(String s, int number) {
		x = number+Integer.parseInt(s);
	}
	
	// method Overloading
	/* discouraged - changing the order
	public Parsers(int number, String s) {
		x = number+Integer.parseInt(s);
	}*/
}
