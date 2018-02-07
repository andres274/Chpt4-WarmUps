import java.util.Scanner;

public class SquareRoot {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number to take the square root of");
		double input = keyboard.nextDouble();
		double squareRootInput = Math.sqrt(input);
		System.out.println("The square root of the number you entered is: " + squareRootInput);
	}
}

