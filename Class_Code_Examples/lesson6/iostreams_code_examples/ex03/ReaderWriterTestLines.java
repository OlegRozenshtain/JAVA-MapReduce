
import java.io.*;

public class ReaderWriterTestLines {

	public static void main(String[] args) throws IOException {

		FileReader in = null;
		FileWriter out = null;

		in = new FileReader("source_local.txt");
		out = new FileWriter("destination_lineByLine.txt");

		BufferedReader input = new BufferedReader(in);
		PrintWriter output = new PrintWriter(out);
		
		String l; // a whole line now...

		while ((l = input.readLine()) != null) {
			System.out.println(l);
			output.println(l);
		}

		in.close();
		out.close();
	}
}
