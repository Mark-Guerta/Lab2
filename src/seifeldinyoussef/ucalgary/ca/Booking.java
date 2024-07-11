package seifeldinyoussef.ucalgary.ca;

public class Booking extends Schedule {

	private int paymentAmount;

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
  
	
	public Booking(int paymentAmount, String startDate, String endDate, String clientName, String sID) {
		super(startDate, endDate, clientName);
		this.paymentAmount = paymentAmount;
		
	}
	
	
}
