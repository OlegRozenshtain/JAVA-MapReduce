package lesson4.day4_code_examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFile implements Printable {

	BufferedReader br;
	
	public TextFile( File fileName ) throws FileNotFoundException {
		
		br = new BufferedReader ( new InputStreamReader( new FileInputStream( fileName )));
	}
	
	@Override
	public void print() throws IOException {
		
		String line = null;
		
		while ( (line = br.readLine()) != null ) {
			
			System.out.println(line);
		}
		
		br.close();
	}
}