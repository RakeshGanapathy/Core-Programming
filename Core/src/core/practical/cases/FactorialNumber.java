package core.practical.cases;

import core.util.InputHandler;

public class FactorialNumber {
static long factorial(long number) {
	long result=1;
	while(number !=0) {
		result *= number;
		number--;
	}
	return result;
	
}
	public static void main(String[] args) {
		long input = InputHandler.getInput();
		long result = factorial(input);
		System.out.println(" the factorial of "+input+" is "+result);

	}

}
