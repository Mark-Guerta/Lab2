package seifeldinyoussef.ucalgary.ca;

public class Reservation extends Schedule {

	
	private int paymentDue;
	private String paymentDate;
	
	
	public int getPaymentDue() {
		return paymentDue;
	}
	public void setPaymentDue(int paymentDue) {
		this.paymentDue = paymentDue;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
	
	
		
	
	public Reservation(int amtDue, String dateDue, String startDate, String endDate, String clientName, String sID) {
		super(startDate, endDate, clientName);
		this.paymentDue = amtDue;
		this.paymentDate = dateDue;
		
	}
}
