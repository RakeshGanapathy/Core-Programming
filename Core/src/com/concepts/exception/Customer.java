package com.concepts.exception;

public class Customer {
	String custName;
	int custId;
	String custNo;
	String custMail;
	
	public Customer(){
		 System.out.println("this () can be called without arguments ");
	}
	void test() {
		System.out.println(this);
	}
	public Customer(int custId) {
		this();
		this.custId = custId;
	}
	public Customer(int custId, String custNo) {
		this(custId);
		this.custNo = custNo;
	}

	public Customer(String custName, int custId, String custNo) {
		this(custId,custNo);
		this.custName = custName;
	}

	public Customer(String custName, int custId, String custNo, String custMail) {
		this(custName,custId,custNo);
		this.custMail = custMail;
	}

	public static void main(String[] args) {
		Customer cust = new Customer("rakesh",23,"94305345","rak@gmail");
		Customer cust2= new Customer("saran",22,"2324234","sandy@gmail");
		System.out.println(cust);
		System.out.println(cust2);
		cust.test();
		cust2.test();
	}

}
