package seifeldinyoussef.ucalgary.ca;

public class CareProfile {

	private String feedingInstructions;
	private String medicationList;
	private String medicationInstructions;
	public String getFeedingInstructions() {
		return feedingInstructions;
	}
	public void setFeedingInstructions(String feed) {
		this.feedingInstructions = feed;
	}
	public String getMedicationList() {
		return medicationList;
	}
	public void setMedicationList(String meds) {
		this.medicationList = meds;
	}
	public String getMedicationInstructions() {
		return medicationInstructions;
	}
	public void setMedicationInstructions(String medInst) {
		this.medicationInstructions = medInst;
	}
	
	CareProfile(String foodInstr, String medList, String medInstr){
		this.feedingInstructions = foodInstr;
		this.medicationList = medList;
		this.medicationInstructions = medInstr;
		
	}
}
