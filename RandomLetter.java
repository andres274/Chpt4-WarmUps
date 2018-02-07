/*
 * Probelm 4.16 Write a program that displays a random uppercase letter
using the Math.random() method.
 */
public class RandomLetter {
	public static void main (String [] args) {
		int num = 65 + (int)(Math.random() * (91-65)); // 91-65 because those 65 - 91 are letters in char
		System.out.println((char)(num));
	}
}
