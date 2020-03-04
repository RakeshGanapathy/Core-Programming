package core.object.conversion;

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {
	// Get the data to be inserted into the object

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Lokesh", "Gupta", new Department(101, "IT"));
		// Creating Object of ObjectMapper define in Jakson Api
		ObjectMapper Obj = new ObjectMapper();
		try {

			// get employee object as a json string
			String jsonStr = Obj.writeValueAsString(employee);
			FileWriter fw = new FileWriter("Employee.json");
			fw.write(jsonStr);
			fw.close();
			// Displaying JSON String
			System.out.println(jsonStr);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
