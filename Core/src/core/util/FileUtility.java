package core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtility {

	public static void writeOnAFile(File file, String input) {
		// try with resource
		try (FileWriter stream = new FileWriter(file);) {
			// to write on stream
			stream.write(input);
			// to flush
			stream.flush();
			System.out.println("file written");
			// close
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readAFile(File file) {
		try (FileReader fr = new FileReader(file);) {
			int i = 0;
			// read continues until the end of the line i.e -1
			while ((i = fr.read()) != -1) {
				// convert int into char
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createWithParentFolder(File folder) {
		if (folder.mkdirs() == true) {
			System.out.println("folder created");
		} else {
			System.out.println("folder not created");
		}
	}

	public static void createFile(File file) {
		try {
			if (file.createNewFile() == true) {
				System.out.println("file created");
			} else {
				System.out.println("file not created");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteFileOrFolder(File file) {
		if (file.delete() == true) {
			System.out.println("deleted");
		} else {
			System.out.println("not deleted");
		}
	}
	
	public static void isFileExist(File file) {
		if(file.exists() == true) {
			System.out.println("file exists");
		} else {
			System.out.println("file not exists");
		}
	}
	
	public static void serializeObjectToFile(Object obj,String path) {
		File file = new File(path);
		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(obj);
			oos.flush();
			System.out.println("serialization is done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializeObjectFromFile(String path) {
		File file = new File(path);
		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
			PurchaseCart ps= (PurchaseCart) ois.readObject();
			System.out.println(ps);
			System.out.println("Deserialization is done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
