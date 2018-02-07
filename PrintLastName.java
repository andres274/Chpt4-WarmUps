import java.util.Scanner;

public class PrintLastName { 
	public static void main (String [] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter your full name");
	String fullName = keyboard.nextLine();
	int k = fullName.lastIndexOf(' ');
	String firstName = fullName.substring(0,k);
	String lastName = fullName.substring(k + 1);
	System.out.println("Welcome Mr. and Mrs. " + lastName);
	}
}
