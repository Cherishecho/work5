package work5;

import java.util.Scanner;

public class PalindromelgnoreNonAlphanumeric {
	public static void main(String[] args){
		// Create a Scanner
		Scanner input=new Scanner(System.in);
		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.println("Ignoring nonalphanumeric characters, \nis "
				+ s + " a palindrome? " + isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
	// Create a new string by eliminating nonalphanumeric chars
	String s1=filter(s);
	// Create a new string that is the reversal of si
	String s2 = reverse(s1);
	// Check if the reversal is the same as the original string
	return s2.equals(s1);
	}
	public static String filter(String s) {
		// Create a string builder
		StringBuilder stringBuilder=new StringBuilder();
	for (int i = 0; i < s.length(); i++) {
		if (Character.isLetterOrDigit(s.charAt(i))) {
		stringBuilder.append(s.charAt(i));
		}
	}
	return stringBuilder.toString();
}
	public static String reverse(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse(); // Invoke reverse in StringBuilder
		return stringBuilder.toString();
	}
}	
