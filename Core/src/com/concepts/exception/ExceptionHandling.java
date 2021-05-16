package com.concepts.exception;

public class ExceptionHandling {
void test() {
	
	System.out.println("test method");
	throw new ArithmeticException();
}
ExceptionHandling() throws RuntimeException,NullPointerException{
	throw new ArithmeticException();
}


	public static void main(String[] args) throws ArithmeticException, NullPointerException{
		int x=20,y=10;
		try {
			int z = x/y;// implicitly an object will get created 
			ExceptionHandling ref = new ExceptionHandling();
			ref.test();
		}
		catch(ArithmeticException |NullPointerException ae) {
		ae.printStackTrace();
		}
		finally {
			System.out.println("exception occurs or not but the finally block will gets "
					+ "executed for sure ");
		}
		System.out.println("main ends");
	}

}



