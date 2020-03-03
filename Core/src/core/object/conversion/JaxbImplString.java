package core.object.conversion;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbImplString {
	private static String jaxbObjectToXML(Employee employee) {
		StringWriter sw = new StringWriter();
		try {
			// Create JAXB Context
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			
			// The JAXB Marshaller interface is responsible for governing the process of
			// serializing Java content trees i.e. Java objects to XML data
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// Required formatting??
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// Write XML to StringWriter
			jaxbMarshaller.marshal(employee, sw);
			

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return sw.toString();
	}

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Lokesh", "Gupta", new Department(101, "IT"));
		String xml = jaxbObjectToXML(employee);
		System.out.println(xml);
	}
}
