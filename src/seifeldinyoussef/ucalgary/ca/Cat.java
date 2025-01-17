package seifeldinyoussef.ucalgary.ca;
/*
 * Cat.java
 * Lab2_ExD
 * Submission Date: July 11, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
public class Cat extends Pet{

	private String breed;
	private String colour;
	private Boolean declawed;
	
	
	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public Boolean getDeclawed() {
		return declawed;
	}


	public void setDeclawed(Boolean declawed) {
		this.declawed = declawed;
	}


	public Cat( String breed, String c, Boolean claw, String name, String petID, String birthDate, String gender) {
		super(name, petID, birthDate, gender);
		this.breed = breed;
		this.colour = c;
		this.declawed = claw;
		
	}
}
