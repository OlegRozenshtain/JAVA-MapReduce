
import java.io.*;

public class DataStreamsTest {

	public static void main(String[] args) throws IOException {

		DataOutputStream dataOutput =
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("data.txt")));

		double[] prices = {100.5,200.3,300.2,100.2,150.1};
		int[] units = {250,222,455,221,12};
		String[] descriptions = {"pen","book","gps","smartphone","ppc"};
				
		for (int i = 0; i < prices.length; i++) {
			dataOutput.writeDouble(prices[i]);
			dataOutput.writeInt(units[i]);
			dataOutput.writeUTF(descriptions[i]);
		}		
	
		dataOutput.close();
		
		DataInputStream dataInput =
				new DataInputStream(
						new BufferedInputStream(
								new FileInputStream("data.txt")));
		
		try {
			
			while (true) {
				
				double price = dataInput.readDouble();
				int unit = dataInput.readInt();
				String desc = dataInput.readUTF();

				System.out.println("Item: " + desc);
				System.out.println("Price: " + price);
				System.out.println("Units: " + unit);
				System.out.printf("%s%.2f\n", "Total: ", unit*price);
				System.out.println();
			}
		}
		
		catch (EOFException e){
			System.out.println("Reached the end of the file!");
		}
		
		
	}
}
