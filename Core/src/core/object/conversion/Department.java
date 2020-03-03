package core.object.conversion;

public class Department {
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

}
