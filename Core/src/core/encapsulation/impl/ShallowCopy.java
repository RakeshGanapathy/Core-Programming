package core.encapsulation.impl;

public class ShallowCopy {

	public static void main(String[] args) {
// process of copying one object to another 
		ShallowCopy obj = new ShallowCopy();
		System.out.println(obj);
		ShallowCopy clone = obj;
		System.out.println(clone);
	}

}
