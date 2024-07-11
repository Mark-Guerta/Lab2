package seifeldinyoussef.ucalgary.ca;

public class CareGuideHardcopy extends CareProfile{
	
	public CareGuideHardcopy(String feedingInstructions, String medicationList, String medicationInstructions) {
		super(feedingInstructions, medicationList, medicationInstructions);
	}
	public void PrintCareGuideHardcopy() {
		System.out.println("Feeding Instructions: " + getFeedingInstructions());
		System.out.println("Medication List: " + getMedicationList());
		System.out.println("Medication Instructions: " + getMedicationInstructions());
	}
}
