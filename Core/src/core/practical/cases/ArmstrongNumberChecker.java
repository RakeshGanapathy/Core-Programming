package core.practical.cases;

import java.util.Scanner;

public class ArmstrongNumberChecker {
	private static int findDigits(int input) {
		int count = 0;
		while (input > 0) {
			input /= 10;
			count++;
		}
		System.out.println("total digits of the input is "+count);
		return count;

	}

	private static void ArmstrongNumber(int originalNumber) {
		int remainder=0, result = 0, temp = originalNumber;
		int totalDigits = findDigits(originalNumber);
		while (temp > 0) {
			remainder = temp % 10;
			temp /= 10;
			result += Math.pow(remainder, totalDigits);
			
		}
		if (result == originalNumber) {
			System.out.println(originalNumber + " is an armstrong number");
		}
		else {
			System.out.println(originalNumber + " is not an armstrong number");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kindly enter the input :");
		int originalNumber = scan.nextInt();
		ArmstrongNumber(originalNumber);
		scan.close();
	}

}
