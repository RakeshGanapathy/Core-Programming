package core.string.operations;

public class StringMethod {
	
	static void convertToCharacter(String name) {
		char[] charArray = name.toCharArray();
		for(char value :charArray) {
			System.out.println(value);
		}
	}
	
	
	static void convertToCharacterOwnImpl(String name) {
		System.out.println("printing the character using own impl");
		for(int index =0;index<name.length();index++) {
			System.out.println(name.charAt(index));
		}
		System.out.println("reverse");
		for(int index =name.length()-1;index>=0;index--) {
			System.out.println(name.charAt(index));
		}
	}
	
	static boolean isPalindrome(String name) {
		for(int first=0,last=name.length()-1;first<last;first++,last--) {
			if(name.charAt(first)!=name.charAt(last)) {
				return false;
			}
		}
		return true;
	}
	
	static void splitInput(String input) {
		String [] name = input.split(" ");
		for(String value:name) {
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		String name = "Jspiders";
//		 length 
//		 J S P I D E R S
//		 1 2 3 4 5 6 7 8
		String location = "vadapalani";
		System.out.println(name.length());
		// index
		// J S P I D E R S
		// 0 1 2 3 4 5 6 7
		System.out.println(name.charAt(5));
		System.out.println(name.contains("ders"));
		System.out.println(name.contains("sre"));
		System.out.println(name.concat(" is an institute"));
		System.out.println(name);
		System.out.println(name.startsWith("J"));
		System.out.println(name.endsWith("rs"));
		System.out.println(name.substring(4));
		System.out.println(name.substring(2, 5));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String name2= "JsPiDeRs";
		System.out.println(name.compareToIgnoreCase(name2));
		//begin index is included
		// end index is not included 
		convertToCharacter(name2);
		convertToCharacterOwnImpl(name2);
	 boolean status=	isPalindrome("racecar");
	 if(status) {
		 System.out.println("the input is palindrome");
	 }
	 else {
		 System.out.println("the input is not palindrome");
	 }
	 splitInput("Jspiders is a training institute");
	}
}
