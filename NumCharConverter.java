import java.util.Scanner;

public class NumCharConverter {
	public static void main (String [] args) {
		System.out.println("Enter a number or a character");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.next();

		if ((input.charAt(0) >=64 && input.charAt(0) <= 90) || (input.charAt(0) >= 97 && input.charAt(0) <= 122 )) {
			System.out.println("The charcter " + input.charAt(0) + " in binary is " + Integer.toBinaryString((int)input.charAt(0)));
			System.out.println("The charcter " + input.charAt(0) + " in hexidecimal is " + Integer.toBinaryString((int)input.charAt(0)));

		}
		else { 
			System.out.println("The number " + input + " in binary is " + Integer.toBinaryString(Integer.parseInt(input)));
			System.out.println("The number " + input + " in hexidecimal is " + Integer.toHexString(Integer.parseInt(input)));
		}
	}
}

