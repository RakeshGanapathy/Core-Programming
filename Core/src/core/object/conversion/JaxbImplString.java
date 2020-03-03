package core.object.conversion;

import java.io.File;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbImplString {

	private static Marshaller jaxbImpl() {
		// Create JAXB Context
		JAXBContext jaxbContext;
		Marshaller jaxbMarshaller = null;
		try {
			jaxbContext = JAXBContext.newInstance(Employee.class);
			// The JAXB Marshaller interface is responsible for governing the process of
			// serializing Java content trees i.e. Java objects to XML data
			jaxbMarshaller = jaxbContext.createMarshaller();
			// Required formatting??
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return jaxbMarshaller;

	}

	private static String jaxbObjectToXMLString(Employee employee) {
		StringWriter sw = new StringWriter();
		try {
			Marshaller jaxbMarshaller = jaxbImpl();
			jaxbMarshaller.marshal(employee, sw);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return sw.toString();
	}

	private static void jaxbObjectToXMLFile(Employee employee) {
		try {
			// Create JAXB Context
			Marshaller jaxbMarshaller = jaxbImpl();
			// Store XML to File
			File file = new File("employee.xml");
			// Writes XML file to file-system
			jaxbMarshaller.marshal(employee, file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private static void jaxbXmlFileToObject(File xmlFile) {
		
		//Call method which read the XML file above
		
        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(Employee.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Employee employee = (Employee) jaxbUnmarshaller.unmarshal(xmlFile);
            
            System.out.println(employee);
        }
        catch (JAXBException e) 
        {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Lokesh", "Gupta", new Department(101, "IT"));
		// java object to xml string
		String xml = jaxbObjectToXMLString(employee);
		System.out.println(xml);
		//java object to xml file
		jaxbObjectToXMLFile(employee);
		
		//xml to object 
		String fileName= "employee.xml";
		File xmlFile = new File(fileName);

		jaxbXmlFileToObject(xmlFile);
		
		
	}
}
