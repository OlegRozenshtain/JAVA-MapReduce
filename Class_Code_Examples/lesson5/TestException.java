package lesson5;

import java.io.IOException;


public class TestException {
	
	
	public static void main(String[] args) {
		
		//System.out.println(args[3]); //ArryIndexOutOfBoundsException		
		System.err.println("Some RED text");
		System.out.println("Some BLACK text");
		
		try {
		
			foo();
		} 
		
		catch (ArithmeticException e) {

			System.out.println("foo failed with Exception (called boo)");
			
			e.printStackTrace();
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

		
		finally {
			
			System.out.println("I'm going to print anyway!");
			
		}
	}
	
	
	static public void foo(){
		throw new RuntimeException("This is an Exception");
		//boo();				
	}

	
	static public void boo() throws Exception{		
		
		//System.out.println(3/0); //ArithmeticException
		throw new Exception("This is an Exception thrown in method boo()");
	}
}
