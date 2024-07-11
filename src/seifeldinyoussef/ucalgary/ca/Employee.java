package seifeldinyoussef.ucalgary.ca;

public class Employee {

	private String name;
	private String employeeID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	public Employee(String name, String EID) {
		this.employeeID = EID;
		this.name = name;
	}
}
