package core.encapsulation.impl;

public class DeepCopy {
	int iValue ;
	short sValue;
	

	public static void main(String[] args) {
		DeepCopy obj = new DeepCopy();
		obj.iValue=20;
		obj.sValue=34;
		DeepCopy clone = new DeepCopy();
		clone.iValue=obj.iValue;
		clone.sValue=obj.sValue;
		System.out.println(clone.iValue);
		System.out.println(clone.sValue);
	}

}
