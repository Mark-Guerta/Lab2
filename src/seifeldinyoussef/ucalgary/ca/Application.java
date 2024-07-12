package seifeldinyoussef.ucalgary.ca;
/*
 * Application.java
 * Lab2_ExD
 * Submission Date: July 11, 2024
 * @author Saif Youssef
 * @author Mark Guerta
 */
import java.util.Scanner;

public class Application {

	public static Client[] clients;
	public static Employee[] employees;
	public static Pet[] pets;
	public static Booking[] bookings;
	public static Reservation[] reservations;
	public static Schedule[] schedule;
	public static CareProfile[] careProfiles;
	
	
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Operation: (add client, add employee, add cat, add dog, add schedule,add booking, add reservation, manage care profile)");
			String operation = scanner.nextLine();
			if (operation.equalsIgnoreCase("exit")) {
				System.out.println("exiting application");
				break;
			}
			
		
		
		
		switch(operation.toLowerCase()) {
		case "add client":
			addClient(scanner);
			break;
		case "add employee":
			addEmployee(scanner);
			break;
		case "add cat":
			addCat(scanner);
			break;
		case "add dog":
			addDog(scanner);
			break;
		case "add booking":
			addBooking(scanner);
			break;
		case "add reservation":
			addReservation(scanner);
			break;
		case "add schedule":
			addSchedule(scanner);
			break;
		case "manage care profile":
			manageCareProfile(scanner);
			break;
		
			}
		}
	scanner.close();
	
	}


public static void addClient(Scanner scanner) {
	
	System.out.println("enter client name:");
	String name = scanner.nextLine();
	System.out.println( "enter client phone number:");
	String phoneNumber = scanner.nextLine();
	System.out.println("enter client Address:");
	String address = scanner.nextLine();
	new Client(name, phoneNumber, address);
		
	
	
}



public static void addEmployee(Scanner scanner) {
	System.out.println("enter employee name:");
	String name = scanner.nextLine();
	System.out.println( "enter employee ID:");
	String employeeID = scanner.nextLine();
	new Employee(name, employeeID);
}


public static void addCat (Scanner scanner) {
	System.out.println("enter name:");
	String name = scanner.nextLine();
	System.out.println("enter petID:");
	String petID = scanner.nextLine();
	System.out.println("enter birthDate:");
	String birthDate = scanner.nextLine();
	System.out.println("enter gender:");
	String gender = scanner.nextLine();
	System.out.println("enter breed:");
	String breed = scanner.nextLine();
	System.out.println("enter colour:");
	String colour = scanner.nextLine();
	System.out.println("is cat declawed(true/false):");
	boolean declawed = Boolean.parseBoolean(scanner.nextLine());
	new Cat(breed, colour, declawed, name, petID,birthDate, gender);
}

public static void addDog (Scanner scanner) {
	System.out.println("enter name:");
	String name = scanner.nextLine();
	System.out.println("enter petID:");
	String petID = scanner.nextLine();
	System.out.println("enter birthDate:");
	String birthDate = scanner.nextLine();
	System.out.println("enter gender:");
	String gender = scanner.nextLine();
	System.out.println("enter breed:");
	String breed = scanner.nextLine();
	System.out.println("enter colour:");
	String colour = scanner.nextLine();
	new Dog(breed, colour, name, petID,birthDate, gender);
}

public static void addBooking(Scanner scanner) {
	System.out.println("enter payment amount:");
	int paymentAmount = scanner.nextInt();
	System.out.println("enter start date:");
	String startDate = scanner.nextLine();
	System.out.println("enter end date:");
	String endDate = scanner.nextLine();
	System.out.println("enter client name:");
	String name = scanner.nextLine();
	System.out.println("enter schedule ID:");
	String sID = scanner.nextLine();
	new Booking(paymentAmount, startDate, endDate, name,sID, sID);
}

public static void addReservation(Scanner scanner) {
	System.out.println("enter payment due:");
	int paymentDue = scanner.nextInt();
	System.out.println("enter payment date:");
	String paymentdate = scanner.nextLine();
	System.out.println("enter start date:");
	String startDate = scanner.nextLine();
	System.out.println("enter end date:");
	String endDate = scanner.nextLine();
	System.out.println("enter client name:");
	String name = scanner.nextLine();
	System.out.println("enter schedule ID:");
	String sID = scanner.nextLine();
	new Booking(paymentDue,startDate, startDate, endDate, name,sID);
}

public static void addSchedule(Scanner scanner) {
	System.out.println("enter payment due:");
	int paymentDue = scanner.nextInt();
	System.out.println("enter payment date:");
	String paymentdate = scanner.nextLine();
	System.out.println("enter start date:");
	String startDate = scanner.nextLine();
	System.out.println("enter end date:");
	String endDate = scanner.nextLine();
	System.out.println("enter client name:");
	String name = scanner.nextLine();
	System.out.println("enter schedule ID:");
	String sID = scanner.nextLine();
	new Schedule(paymentDue,startDate, startDate, endDate, name,sID);
}
public static void manageCareProfile(Scanner scanner) {
	System.out.println("enter feeding instructions:");
	String feedingInstructions = scanner.nextLine();
	System.out.println("enter medication list:");
	String medicationList = scanner.nextLine();
	System.out.println("enter medication Instructions:");
	String medicationInstructions = scanner.nextLine();
	CareGuideHardcopy careGuide  = new CareGuideHardcopy(feedingInstructions, medicationList, medicationInstructions);
	careGuide.PrintCareGuideHardcopy();
	
	
}}
