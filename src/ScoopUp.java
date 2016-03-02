import java.util.Scanner;

public class ScoopUp {

	public static void main(String [] args){

		int option;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("***Welcome to ScoopUp*** /nPress 1 to Sign Up /nPress 2 to Sign In /nPress 3 to Exit");
		option = in.nextInt();
		
		if (option > 3 || option < 1) {
			System.out.println("Invalid input. Try again");
		}
		
		if (option == 1) {
			Member newMember = new Member();
			System.out.println("***Sign Up*** /nEnter your email address: ");
			newMember.setUsername(in.next());
			System.out.println("Enter your password: ");
			in.next();
			newMember.setPassword(in.next());
			System.out.println("/n/nPress 1 to Sign Up as Driver /nPress 2 to Sign Up as Passenger");
			option = in.nextInt();
			if (option > 2 || option < 1) {
				System.out.println("Invalid input. Try again");
			}
			
			if (option == 1){
				in.next();
				System.out.println("***Create Driver's Profile*** /nEnter first name: ");
				newMember.setFirstName(in.next());
				System.out.println("Enter last name: ");
				newMember.setLastName(in.next());
				System.out.println("Enter cell number: ");
				newMember.setCellNumber(in.next());
				System.out.println("Enter home address: ");
				newMember.setAddress(in.next());
			}
			
		}
		if (option == 2) {
			
		}
		if (option == 3) {
			
		}
		
	}
}
