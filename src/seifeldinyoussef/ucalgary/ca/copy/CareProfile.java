package seifeldinyoussef.ucalgary.ca.copy;

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
		foodInstr = feedingInstructions;
		medList = medicationList;
		medInstr = medicationInstructions;
		
	}
}
