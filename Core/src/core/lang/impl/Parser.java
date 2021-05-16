package core.lang.impl;

public class Parser {

	public static void main(String[] args) {
		String value ="102";
		byte bval = Byte.parseByte(value);
		System.out.println(bval);
		int iVal = Integer.parseInt(value);
		System.out.println(iVal);
		float fVal = Float.parseFloat(value);
		System.out.println(fVal);
		double dVal = Double.parseDouble(value);
		System.out.println(dVal);
		long lVal = Long.parseLong(value);
		System.out.println(lVal);
	}

}
