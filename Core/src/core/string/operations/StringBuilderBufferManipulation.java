package core.string.operations;

public class StringBuilderBufferManipulation {
	static String reverseString (String input ) {
		StringBuilder strbdr = new StringBuilder(input);
		strbdr.reverse();
		return strbdr.toString();
	}
	public static void main(String[] args) {
		StringBuilder bdr = new StringBuilder("jspiders");
		StringBuilder bdr2 = new StringBuilder("qspiders");
		StringBuilder bdr3 = new StringBuilder("jspiders");
		System.out.println(bdr.toString());
		System.out.println(bdr2.toString());
		System.out.println(bdr.hashCode());
		System.out.println(bdr2.hashCode());
		System.out.println(bdr3.hashCode());
		System.out.println(reverseString("Hi this is practise program"));
	System.out.println(bdr2.append(" is a institute"));
	System.out.println(bdr2);
	System.out.println(bdr2.delete(2, 10));
	System.out.println(bdr2);
	System.out.println(bdr2.insert(2,"piders i"));
	System.out.println(bdr2);
	}

}
