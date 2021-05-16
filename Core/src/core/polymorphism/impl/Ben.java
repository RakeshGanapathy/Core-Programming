package core.polymorphism.impl;

public class Ben {
	String form = "Human";

	void attacks() {
		System.out.println("attack enemies");
	}
}

class FireFighter extends Ben {// 1. inheritance
	String power = "fire";

	void attacks() { // 2. method overriding
		System.out.println("attack enemies using fire power");
	}
}

class Diamond extends Ben {
	String power = "diamond";

	void attacks() {
		System.out.println("using diamond");
	}
}

class FourArms extends Ben {
	String power = "fourArms";

	void attacks() {
		System.out.println("using martial arts ");
	}
}

class TerraSpin extends Ben {
	String power = "spin";

	void attacks() {
		System.out.println("using spin power");
	}
}

class Implmentation {
	
	public static void main (String [] args) {
		Ben ben = new Ben();
		System.out.println(ben.form);
		ben.attacks();
		ben = new FireFighter();// 3. upcasting
		ben.attacks();
		ben = new Diamond();
		ben.attacks();
		ben =new FourArms();
		ben.attacks();
		ben = new TerraSpin();
		ben.attacks();
	}
}
