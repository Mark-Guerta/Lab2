package seifeldinyoussef.ucalgary.ca;

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
	
	public Dog( String breed, String c, String name, String petID, String birthdate, String gender) {
		super (name, petID, birthdate, gender);
		this.colour = c;
		this.breed = breed;
	}	
	public Dog() {
		super("", "", "", "");
		this.breed = "";
		this.colour = "";
	}
	
	
	
	}

