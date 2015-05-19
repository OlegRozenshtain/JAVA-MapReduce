package lesson3.day3_code_examples;

public class TestParse {

	public static void main( String[] args ) {
	
		System.out.println( Parsers.parseInt("45") + Parsers.parseInt("55") );
		
		int twenty = Parsers.parseInt("20");
		System.out.println(twenty);
	}
}
