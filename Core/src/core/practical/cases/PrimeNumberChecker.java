package core.practical.cases;

import java.util.Scanner;

public class PrimeNumberChecker {

	static int isPrime(long input) {
		int i = 0;
		int num = 0;
		int count =0;

		for (i = 1; i <= input; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				count++;
				System.out.print(i +" ");
			}

		}
		return count;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kindly enter the input :");
		long input = scan.nextLong();
		if (input == 0||input ==1)
			System.out.println("enter the valid input");
		else {
		int count =	isPrime(input);
		System.out.println("\nthere are "+count+" prime numbers in the "+input);
		}

		scan.close();
	}
}
