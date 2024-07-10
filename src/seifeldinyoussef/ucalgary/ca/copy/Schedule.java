package seifeldinyoussef.ucalgary.ca.copy;

public class Schedule {

	private String startDate;
	private String endDate;
	private String clientName;
	private String sID;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getsID() {
		return sID;
	}
	public void setsID(String sID) {
		this.sID = sID;
	}
	public Schedule( String start, String end, String name) {
		startDate = start;
		endDate = end;
		clientName = name;
	}
}
