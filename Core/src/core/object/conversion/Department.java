package core.object.conversion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class Department {
 public Department() {
		super();
	}

private int dId;
private  String dName;

public int getdId() {
	return dId;
}

public void setdId(int dId) {
	this.dId = dId;
}

public String getdName() {
	return dName;
}

public void setdName(String dName) {
	this.dName = dName;
}

public Department(int dId, String dName) {
	super();
	this.dId = dId;
	this.dName = dName;
}

@Override
public String toString() {
	return "Department [dId=" + dId + ", dName=" + dName + "]";
}

}
