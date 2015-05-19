
	import java.io.*;

	class Alpha implements Serializable {
		int alpha = 10;
		Beta b; // make transient in not yours or implement Serializable if it is and needed
		public Alpha() {
			System.out.println("In Alpha");
			b = new Beta(alpha); // composing Beta object into Alpha object
		}
	}

	class Beta { // Beta objects are not Serializable
		int beta = 20;
		public Beta(int beta) {
			System.out.println("In Beta value is " + beta);
			this.beta = beta;
		}
		public Beta() {
		}
	}

	public class ComposingNoneSerializableExample {
		
		public static void main(String[] args) throws Exception {
			
			Alpha alpha = new Alpha();
			
			FileOutputStream fos = new FileOutputStream("alpha.dat");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(alpha);
			
			os.close();
			fos.close();
		}
	}


