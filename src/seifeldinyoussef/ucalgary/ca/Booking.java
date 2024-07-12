package seifeldinyoussef.ucalgary.ca;
/*
 * Booking.java
 * Lab2_ExD
 * Submission Date: July 11, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public class Booking extends Schedule {

	private int paymentAmount;

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
  
	
	public Booking(int paymentAmount, String startDate, String endDate, String clientName, String sID, String sID2) {
		super(paymentAmount, startDate, endDate, clientName, sID2, sID2);
		this.paymentAmount = paymentAmount;
		
	}
	
	
}
