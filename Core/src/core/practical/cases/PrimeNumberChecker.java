package core.practical.cases;

import java.util.Scanner;

public class PrimeNumberChecker {

	static void isPrime(long input) {
		int i = 0;
		int num = 0;

		for (i = 1; i <= input; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				System.out.print(i + " ");
			}

		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kindly enter the input :");
		long input = scan.nextLong();
		if (input == 0)
			System.out.println("enter the valid input ");
		else if (input == 1 || input == 3) {
			System.out.println(input + " is a prime number ");
		} else {
			isPrime(input);
		}

		scan.close();
	}
}
