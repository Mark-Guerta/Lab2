package seifeldinyoussef.ucalgary.ca;
/*
 * Pet.java
 * Lab2_ExD
 * Submission Date: July 11, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public class Pet {
	
	private String name;
	private String petID;
	private String birthDate;
	private String gender;
	private CareProfile careProfile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPetID() {
		return petID;
	}
	public void setPetID(String petID) {
		this.petID = petID;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public CareProfile getCareProfile() {
		return careProfile;
	}
	public void setCareProfile(CareProfile careProfile) {
		this.careProfile = careProfile;
	}
	public Pet( String name, String petID, String birthDate, String gender) {
	
		this.name = name;
		this.petID = petID;
		this.birthDate = birthDate;
		this.gender = gender;
	}

}
