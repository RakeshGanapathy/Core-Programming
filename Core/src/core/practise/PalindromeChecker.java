package core.practise;

import java.util.Scanner;

public class PalindromeChecker {

	static boolean isPalindrome(String str) {

		// Pointers pointing to the beginning and the end of the string

		for (int first = 0, last = str.length() - 1; first < last; first++, last--) {
			if (str.charAt(first) != str.charAt(last)) {

				return false;
			}
		}
		// Given string is a palindrome
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input :");
		String input = scan.next();
		String output;

		if (isPalindrome(input))
			output = " a palindrome";
		else
			output = "Not a palindrome";

		System.out.println("The given string " + input + " is " + output);
		scan.close();
	}

}
