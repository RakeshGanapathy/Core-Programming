package core.practical.cases;

import java.util.Scanner;

public class OddEvenChecker {

	public static void main(String[] args) {

		System.out.println("Enter an Integer number:");
		Scanner scan = new Scanner(System.in);
		long num = scan.nextInt();

		if (num % 2 == 0)
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");
		scan.close();
	}

}
