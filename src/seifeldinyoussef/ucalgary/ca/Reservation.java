package seifeldinyoussef.ucalgary.ca;
/*
 * Reservation.java
 * Lab2_ExD
 * Submission Date: July 11, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
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
		super(amtDue, startDate, endDate, clientName, sID, sID);
		this.paymentDue = amtDue;
		this.paymentDate = dateDue;
		
	}
}
