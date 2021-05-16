package core.polymorphism.impl;

import com.sun.jdi.Method;

public class MethodOverloading {

	final void print(String name) {
		System.out.println(name);
	}

	static void print(String name, int id) {
		System.out.println(name);
		System.out.println(id);
	}

	final static void print(boolean status, String name) {
		System.out.println("the employee " + name + " is active " + status);
	}

	int main(int num) {
		System.out.println("overloaded the main method");
		return num;
	}

	public static void main(String[] args) {
		MethodOverloading ref = new MethodOverloading();
		ref.print("rakes");
		print("rajesh", 33);
		print(true, "rakesh");
		ref.main(2);
	}

}
