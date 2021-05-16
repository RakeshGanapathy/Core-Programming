package core.lang.impl;

public class ParseOperation {
public static void main (String[] args) {
	String str ="10";
	String str2= "true";
	byte bVal = Byte.parseByte(str);
	System.out.println(bVal);
	long lVal = Long.parseLong(str);
	System.out.println(lVal);
	boolean boolValue = Boolean.parseBoolean(str2);
	System.out.println(boolValue);
}
}
