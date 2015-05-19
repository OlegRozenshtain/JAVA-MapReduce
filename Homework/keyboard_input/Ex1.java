package keyboard_input;

import java.util.Scanner;

/**
 * Input width and height of a rectangle and calculate its size and peripheral
 */
public class Ex1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter the width of the rectangle:");
		float width = input.nextFloat();
		System.out.println("please enter the height of the rectangle:");
		float height = input.nextFloat();
		
		System.out.println("\nrectangles size is: " + width*height);
		System.out.println("rectangles peripheral is: " + 2*(width+height));
		
		input.close();
	}
}
