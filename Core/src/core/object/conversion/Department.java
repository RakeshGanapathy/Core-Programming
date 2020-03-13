package core.object.conversion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Data;
@Data
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Department {
 public Department() {
		super();
	}

private int dId;
private  String dName;


public Department(int dId, String dName) {
	super();
	this.dId = dId;
	this.dName = dName;
}
public static void main (String [] args) {
	Department dept = new Department (23,"1q");
	System.out.println(dept.toString());
	System.out.println(dept.dId);
	new Department(1,"abc").toString();
	
}

}
