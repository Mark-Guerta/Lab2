package seifeldinyoussef.ucalgary.ca;

public class Client {

	private String name;
	private String phoneNumber;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Client(String name, String PNum, String address) {
		this.name = name;
		this.phoneNumber = PNum;
		this.address = address;
		
	}
}
