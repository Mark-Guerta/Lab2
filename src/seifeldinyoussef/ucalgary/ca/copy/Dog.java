package seifeldinyoussef.ucalgary.ca.copy;

public class Dog extends Pet{

	private String breed;
	private String colour;
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
	
	public Dog( String breed, String c) {
		c = colour;
		
	}
}
