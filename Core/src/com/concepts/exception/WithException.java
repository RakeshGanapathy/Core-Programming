package com.concepts.exception;

public class WithException {
	void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		int x = 10, y = 10, z = 0;
		try {
			z = x / y;
			WithException ref = new WithException();
			ref.test();
			// below line will get skipped
			System.out.println(z);
			System.exit(1);
			try {}
			finally {
				
			}
		} catch (ArithmeticException|NullPointerException ae) {
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
		finally {
System.out.println("exception occurs or not but i will be executed for sure");
		}
		System.out.println(z);
		System.out.println("main ends");
	}

}
