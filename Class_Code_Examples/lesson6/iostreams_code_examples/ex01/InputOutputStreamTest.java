
import java.io.*;

public class InputOutputStreamTest {

	public static void main(String[] args) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		in = new FileInputStream("source.txt");
		out = new FileOutputStream("destination.txt");

		int c; // read() returns int

		while ((c = in.read()) != -1) {
			out.write(c);
		}

		if (in != null) {
			in.close();
		}
		if (out != null) {
			out.close();
		}
	}
}
