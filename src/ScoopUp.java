import java.util.Scanner;

public class ScoopUp {

	public static void main(String [] args){

		int option;
		String email;
		String password;
		Member newMember = new Member();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("***Welcome to ScoopUp*** \nPress 1 to Sign Up \nPress 2 to Sign In \nPress 3 to Exit\n");
		option = in.nextInt();
		
		if (option > 3 || option < 1) {
			System.out.println("Invalid input. Try again");
		}
		
		if (option == 1) {
			
			System.out.println("***Sign Up*** \nEnter your email address: ");
			newMember.setUsername(in.next());
			System.out.println("Enter your password: ");
			newMember.setPassword(in.next());
			// To Do: add forgot password
			System.out.println("***Create User Profile*** \nEnter first name: ");
			newMember.setFirstName(in.next());
			System.out.println("Enter last name: ");
			newMember.setLastName(in.next());
			System.out.println("Enter cell number: ");
			newMember.setCellNumber(in.next());
			System.out.println("Enter home address: ");
			newMember.setAddress(in.next());
			System.out.println("Enter driver license number (driver's only) or press enter: ");
			newMember.setLicenseNumber(in.next());
			option = 2;
		}
		
		if (option == 2) {
			System.out.println("Enter email address: ");
			email = in.next();
			System.out.println("Enter password");
			password = in.next();
			
			if (email.equals(newMember.getUsername()) && password == newMember.getPassword()) {
			System.out.println("\n\n***Main Menu***\nPress 1 to Get a ride \nPress 2 to Give a ride \nPress 3 to Add a vehicle \nPress 4 to Edit you profile");
			option = in.nextInt();
			} else {
				System.out.println("Invalid user's credentials. Try again");
			}
			if (option > 3 || option < 1) {
				System.out.println("Invalid input. Try again");
			}
			
			if (option == 1) {
				System.out.println("***Get a ride***");
				
			}
			
			if (option == 2) {
				System.out.println("***Give a ride***");
				
			}
			
			if (option == 3) {
				System.out.println("***Add a vehicle***");
				Vehicle newVehicle = new Vehicle();
				System.out.println("Enter year");
				newVehicle.setYear(in.nextInt());
				System.out.println("Enter make");
				newVehicle.setMake(in.next());
				System.out.println("Enter model");
				newVehicle.setModel(in.next());
				System.out.println("Enter color");
				newVehicle.setColor(in.next());
				System.out.println("Enter number of available seats");
				newVehicle.setSeatNumber(in.nextInt());
				System.out.println("Enter license plate number");
				newVehicle.setLicensePlate(in.next());
			}
			
			if (option == 4) {
				System.out.println("***Edit your profile***");
				
			}
			if (option == 5) {
			
				
			}
		}
		if (option == 3) {
			
		}
		
	}
}
