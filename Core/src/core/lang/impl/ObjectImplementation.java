package core.lang.impl;

public class ObjectImplementation implements Cloneable{
	int iValue ;
	boolean status ;
	public static void main(String[] args) {
		ObjectImplementation ref= new ObjectImplementation();
		ObjectImplementation ref2= new ObjectImplementation();
		System.out.println(ref.toString());// fully qualified class name
		System.out.println(ref.hashCode());
		System.out.println(ref.equals(ref2));// compares memory address
		System.out.println(ref.getClass());
		System.out.println(ref.getClass().getName());
		System.out.println(ref);
		ObjectImplementation clone = null ;
		ref.iValue=30;
		ref.status=true;
		// process of creating another copy of object in heap memory
		try {
			clone= (ObjectImplementation) ref.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	System.out.println(clone.iValue);
	System.out.println(clone.status);
	System.out.println(ref);
	System.out.println(clone);
	}

}
