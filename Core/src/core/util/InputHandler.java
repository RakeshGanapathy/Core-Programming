package core.util;

import java.util.Scanner;

public class InputHandler {
	public static long  getInput() {
	Scanner scan = new Scanner(System.in);
	System.out.println("kindly enter the input :");
	long originalNumber = scan.nextLong();
	scan.close();
	return originalNumber;
}
}
