package core.practical.cases;

import java.util.Scanner;

public class FibonacciGenerator {
	static void fiboGenarator(long limit) {
		int n1 = 0, n2 = 1, n3, i;
		System.out.print(n1 + " " + n2);
		
		for (i = 2; i < limit; ++i)
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kindly enter the input for fibo series:");
		long input = scan.nextLong();
		fiboGenarator(input);
		scan.close();
	}

}
