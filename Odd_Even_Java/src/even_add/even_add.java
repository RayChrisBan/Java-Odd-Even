package even_add;

import java.util.Scanner;

public class even_add {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int wholeNumber = s.nextInt();
		System.out.println();
		
		if(wholeNumber % 2 == 0) {
			System.out.println("This is even number " + " " + wholeNumber);
		}
		else System.out.println("This is odd number " + " " + wholeNumber);
	}

}
