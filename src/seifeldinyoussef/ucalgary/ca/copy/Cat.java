package seifeldinyoussef.ucalgary.ca.copy;

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


	public Cat( String breed, String c, Boolean claw) {
		breed = breed;
		c = colour;
		claw = declawed;
		
	}
}
