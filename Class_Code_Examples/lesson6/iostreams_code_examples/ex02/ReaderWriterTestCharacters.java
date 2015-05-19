
import java.io.*;

public class ReaderWriterTestCharacters {

	public static void main(String[] args) throws IOException {

		FileReader in = null;
		FileWriter out = null;

		in = new FileReader("source_local.txt");
		out = new FileWriter("destination_local.txt");

		int c; // read() returns int

		while ((c = in.read()) != -1) {
			System.out.print(c);
			out.write(c);
			/*
			 * 116 t
			 * 104 h
			 * 101 e
			 * 114 r
			 * 101 e
			 * 32   (space)
			 */
		}

		if (in != null) {
			in.close();
		}
		if (out != null) {
			out.close();
		}
	}
}
