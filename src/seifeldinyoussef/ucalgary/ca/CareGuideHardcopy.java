package seifeldinyoussef.ucalgary.ca;
/*
 * CareGuideHardcopy.java
 * Lab2_ExD
 * Submission Date: July 11, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
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
