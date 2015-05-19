package lesson5;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;


public class TestExceptions {
	public static void main(String[] args) {
	
			try {
				foo1();
				foo2();
				foo3();
				foo4();
			} catch (EOFException | SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (IndexOutOfBoundsException i) {
				i.printStackTrace();
			}
		
	}

	public static void foo1() throws IOException {
		
	}

	
	public static void foo2() throws EOFException {
		
	}
	
	public static void foo3() throws SocketException {
		
	}
	
	public static void foo4() throws IndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException("Test ArrayIOOBE");
	}
	
	
	
}
