import java.io.*;
import java.util.Date;

public class FileTest {
	
	public static void main(String args[]) {
		
		// run once with file name existing on disk
		// run once with file name not existing on disk
		// run once with folder not existing on disk
		// run once with folder existing on disk and has contents
		// change args[0]'s value accordingly
		String fileName = args[0];
		File fn = new File(fileName);
		
		System.out.println("Name: " + fn.getName());
		
		if (!fn.exists()) {
			System.out.println(fileName + " does not exists.");

			/* Create a temporary directory instead. */
			System.out.println("Creating temp directory...");
			
			fileName = "temp";
			fn = new File(fileName);
			fn.mkdir();
			
			System.out.println(fileName	+ (fn.exists() ? " exists" : " does not exist"));
			
			System.out.println("Deleting temp directory...");
			fn.delete();
			
			System.out.println(fileName + " is a " + (fn.isFile() ? "file." : "directory."));

			if (fn.isDirectory()) {
				String content[] = fn.list();
				System.out.println("The content of this directory:");
				for (int i = 0; i < content.length; i++) {
					System.out.println(content[i]);
				}
			}

			if (!fn.canRead()) {
				System.out.println(fileName + " is not readable.");
				return;
			}

			long fileSize = (fn.isDirectory()) ? 0 : fn.length(); // undefined return value for folders
			Date dateModified = new Date(fn.lastModified());
			
			System.out.println(fileName + " is " + fileSize + " bytes long.");
			System.out.println(fileName + " was last modified at " + dateModified);

			if (!fn.canWrite()) {
				System.out.println(fileName + " is not writable.");
			}
		}
	}
}
