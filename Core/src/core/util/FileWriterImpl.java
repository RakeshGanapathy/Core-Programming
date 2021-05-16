package core.util;

import java.io.File;

public class FileWriterImpl {

	public static void main(String[] args) {
		File file = new File("H:\\writertest.txt");
		String input = "Hi this is programming class \n from vadapalani";
		FileUtility.writeOnAFile(file,input);
		FileUtility.readAFile(file);
	}

}
