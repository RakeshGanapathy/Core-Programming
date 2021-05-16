package core.abstraction.impl;

public abstract class AbstractImpl {
	// variables are allowed
	static int count = 20;
	int iValue = 23;

// abstract method = making the subclass mandatory to impl provideImpl()
	abstract void provideImpl();

	// static and instance method are allowed
	static void print() {
		System.out.println("static method is allowed");
	}

	void testMethod() {// concrete method
		System.out.println("testmethod");
	}

//blocks are allowed
	static {
		System.out.println("static block of abstract class");
	}
	{
		System.out.println("instance block of abstract class");
	}

// constructor are allowed but object creation is not allowed 

	public AbstractImpl() {
		System.out.println("constructor of Abstract class");
	}

}


