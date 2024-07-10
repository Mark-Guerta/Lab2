package seifeldinyoussef.ucalgary.ca.copy;

public class Booking extends Schedule {

	private int paymentAmount;

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
  
	
	public Booking(int amt) {
		paymentAmount = amt;
		
	}
	
}
