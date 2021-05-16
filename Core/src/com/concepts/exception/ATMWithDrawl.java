package com.concepts.exception;

import java.util.Scanner;

public class ATMWithDrawl {
	
	static int withDrawl(int withDrawAmount) throws InSufficientBalanceException {
		int balance = 5000;
		if(balance>withDrawAmount) {
			balance -=withDrawAmount;
			return balance ;
		}
		else {
			throw new InSufficientBalanceException("Insuffient balance");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the withdrawl amount");
		int withDrawAmount = scan.nextInt();
		try {
			int balance = withDrawl(withDrawAmount);
			System.out.println("your balance is "+balance);
		} catch (InSufficientBalanceException e) {
			System.out.println("your withdrawl amount is greated than your balance");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		finally {
			scan.close();
		}
		
	}

}
