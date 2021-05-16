package core.string.operations;

public class RemoveSpecialChar {

	static String removeSpecialChar(String input) {
		String resultStr = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) > 64 && input.charAt(index) <= 122 || input.charAt(index) == 32) {
				resultStr = resultStr + input.charAt(index);
			}
		}
		return resultStr;
	}

	static String convertToUpperCase(String input) {
		int tempValue;
		String resultStr = "";
		for (int index = 0; index < input.length(); index++) {
			// converting the char into ascii code
			tempValue = (int) input.charAt(index);
			// converts the lowercase into uppercase by lowercase(value) -32
			if (tempValue < 123 && tempValue > 96) {
				tempValue = tempValue - 32;
			}
			resultStr = resultStr + (char) tempValue;
		}
		return resultStr;
	}

	static String removeUsingRegex(String input) {
		String regex = "[#&($]";
		String regex2 = "[^a-zA-Z0-9 ]";
		String resultStr = input.replaceAll(regex2, "");
		return resultStr;
	}

	public static void main(String[] args) {
		String input = "#this $string &Contains (Special charaters";
		String result = removeSpecialChar(input);
		System.out.println(result);
		String result2 = removeUsingRegex(input);
		System.out.println(result2);
		String result3 = convertToUpperCase(result2);
		System.out.println(result3);
	}

}
