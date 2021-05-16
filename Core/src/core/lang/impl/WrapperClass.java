package core.lang.impl;
public class WrapperClass {
	public static void main(String[] args) {
		byte bValue = 20;
		short sValue = 34;
		int iValue = 30;
		long lValue =23;
		float fValue =3.4f;
		double dValue =34.45;
		char chValue ='w';
		boolean boolValue = true;
		// process of converting the datatype into respective wrapper class object is 
// boxing 
		Byte bObj = new Byte(bValue);
		System.out.println(bObj);
		Short sObj = new Short(sValue);
		System.out.println(sObj);
		Float fObj = new Float (fValue);
		System.out.println(fObj);
		Character cObj = new Character(chValue);
		System.out.println(cObj);
		// unboxing 
		char chVal = cObj.charValue();
		System.out.println(chVal);
		float fVal = fObj.floatValue();
		System.out.println(fVal);
		short sVal = sObj.shortValue();
		System.out.println(sVal);
	}

}
