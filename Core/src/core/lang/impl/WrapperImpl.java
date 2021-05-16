package core.lang.impl;

public class WrapperImpl {

	public static void main(String[] args) {
		byte bValue =10;
		float fValue =34.56f;
		boolean boolValue = false;
		long lValue =23442;
		
		System.out.println("--Boxing--");
		Byte bObj = new Byte(bValue);
		System.out.println(bObj);
		Float fObj = new Float(fValue);
		System.out.println(fValue);
		Boolean boolObj = new Boolean(boolValue);
		System.out.println(boolObj);
		Long lObj = new Long(lValue);
		System.out.println(lObj);
		System.out.println("--UN Boxing---");
		byte byteValue = bObj.byteValue();
		float floatValue = fObj.floatValue();
		boolean boolValue1 = boolObj.booleanValue();
		long longValue=lObj.longValue();
		System.out.println(byteValue);
		System.out.println(floatValue);
		System.out.println(boolValue1);
		System.out.println(longValue);
		

	}

}