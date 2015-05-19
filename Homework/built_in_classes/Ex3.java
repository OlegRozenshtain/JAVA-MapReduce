package built_in_classes;

import java.util.Scanner;

/**
 * input a string of text and an array of indices and make a new string with 
 * spaces inserted in the indices positions.
 */
public class Ex3
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a line");
		String text = input.nextLine();
		
		// predetermine array size for its allocation
		System.out.println("\nplease enter number of indices to be entered");
		int numIndices = input.nextInt();
		int indices[] = new int[numIndices];
		System.out.println("please enter indices (lowest is 1)");
		for(int i = 0; i < indices.length; ++i) 
		{
			indices[i] = input.nextInt();
		}
		
		int swapTemp = 0;
		// bubble sort indices in descending order
	    for(int i = 0; i < indices.length - 1; ++i)
	    {
	    	for(int j = 0; j < indices.length - i - 1; ++j) 
	        {
	    		if(indices[j] < indices[j+1])
	    		{
	    			swapTemp = indices[j];
	    			indices[j] = indices[j+1];
	    			indices[j+1] = swapTemp;
	    		}
	        }
	    }
	      
	    // add spaces starting from the end of the string (indices were sorted)
	    // to keep indices relative to original text
	    for(int i = 0; i < indices.length; ++i) 
	    {
	    	// check if index legal
	    	if((indices[i] > 0) && (indices[i] <= text.length()))
	    	{
	    		text = text.substring(0, indices[i]-1) + " " + 
	    			   text.substring(indices[i]-1, text.length());
	    	}
		}
	    
		System.out.println("\nthe line with spaces inserted in the indices " +
						   "positions:");
		System.out.println(text);
		
		input.close();
	}
}