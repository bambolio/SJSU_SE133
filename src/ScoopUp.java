
		
/*
 * to test this program :
 *    -121.9232602  < X < -121.8432602
 *     37.2951916 < Y < 37.3751916
 *     
 *     basically center +- .04 
 */
	     

		/////////////////////////////////////////  CENTER =  -121.8832602,  37.3351916, SJSU X , Y  //////////////////////////////////////
	     import java.util.Calendar;
import java.util.Scanner;

	     public class ScoopUp 
	     {
	    
	    	 
	    	 
	     	public static void main(String [] args)
	     	{
	     		int[] departures = new int[10];
	     		int[] arrivals = new int[10];
	     		
	     		
	     		 Driver driver1 = new Driver( "Muhammed", false,-121.8892602 ,37.3951916 ); // north
	    	     Driver driver2 = new Driver("Jakub" , false,-121.8892602 ,37.3151916 ); // south
	    	     Driver driver3 = new Driver( "Dustin" , false,-121.9892602 ,37.3351916 ); //east 
	    	     Driver driver4 = new Driver( "Jeet" , false,-121.8192602 ,37.3151916 ); //west
	    	     
	    	     System.out.println( " Arraylist size is : " + Driver.drivers.size() ); // just a test 
	     		
	    	    // starts the main menu 
	     		repeater(1);

	     		// Add a Driver
//	     		Member Tim = new Member();
//	     		Tim.setStatus(2);
//	     		Tim.setAddress("1313 Like Ln San Jose CA");
//	     		//Tim.addVehicle("2010 Audi A4");
//	     		Tim.setPreference(0);
//	     		departures[0] = 800;
//	     		departures[1]  = 800;
//	     		departures[2] = 800;
//	     		departures[3]  = 800;
//	     		departures[4] = 1100;
//	     		arrivals[0] = 900;
//	     		arrivals[1] = 900;
//	     		arrivals[2] = 900;
//	     		arrivals[3] = 900;
//	     		arrivals[4] = 1200;

	     		// Set Drivers location
	     		RideSchedule TimsLocation = new RideSchedule();
	     		TimsLocation.setLocation(TimsLocation.getLocation());

	     		// Set Drivers schedule
	     		MemberSchedule TimsSchedule = new MemberSchedule(arrivals, departures);
	     		TimsSchedule.setDeparture(departures);
	     		TimsSchedule.setArrival(arrivals);

	     		// Add a Passenger
	     		Member Jack = new Member();
	     		Jack.setStatus(1);
	     		Jack.setAddress("636 Milky Way Ln San Jose CA");
	     		Jack.setPreference(0);
	     		departures[0] = 830;
	     		departures[1]  = 830;
	     		departures[2] = 830;
	     		departures[3]  = 830;
	     		departures[4] = 1130;
	     		arrivals[0] = 900;
	     		arrivals[1] = 900;
	     		arrivals[2] = 900;
	     		arrivals[3] = 900;
	     		arrivals[4] = 1200;

	     		// Set Passengers location
	     		RideSchedule JacksLocation = new RideSchedule();
	     		JacksLocation.setLocation(JacksLocation.getLocation());

	     		// Set Passengers schedule
	     		MemberSchedule JacksSchedule = new MemberSchedule(arrivals, departures);
	     		JacksSchedule.setDeparture(departures);
	     		JacksSchedule.setArrival(arrivals);

	     		// Book a ride
	     	}
	     	public static void  repeater(int i )
	     	{
	     		 Caculation cal = new Caculation() ;

	     		if (i == 1 )
	     		{
	     			System.out.println(".:Main Menu:.");
	     			System.out.println("1. Sign up");
	     			System.out.println("2. Log in");
	     			System.out.println("3. Exit");
	     			System.out.println("4. make a random request");

	     			Scanner reader = new Scanner(System.in);

	     			Member member = new Member();

	     			int input = Integer.parseInt(reader.nextLine());

	     			if (input == 1)
	     			{
	     				System.out.println("Please enter your name: ");
	     				member.setFirstName(reader.nextLine());

	     				System.out.println("Please enter your email: ");
	     				member.setEmail(reader.nextLine());

	     				System.out.println("Please enter your password: ");
	     				member.setPassword(reader.nextLine());

	     				System.out.println("Please enter your address: ");
	     				member.setAddress(reader.nextLine());



	     				Vehicle vehicle = new Vehicle();

	     				System.out.println("Enter your vehicle information: ");
	     				System.out.println("Make: ");
	     				vehicle.setMake(reader.nextLine());

	     				System.out.println("Model: ");
	     				vehicle.setModel(reader.nextLine());

	     				System.out.println("Year: ");
	     				vehicle.setYear(reader.nextInt());

	     				System.out.println("Color: ");
	     				vehicle.setColor(reader.nextLine());

	     				reader.nextLine();
	     				System.out.println("License Plate: ");
	     				String s = reader.nextLine();
	     				vehicle.setLicensePlate(s);

	     				System.out.println("Sign up Successfull!");

	     				System.out.println("1. Return to Main Menu");
	     				System.out.println("2. Exit");
	     				int j = reader.nextInt();

	     				if (j  == 2)
	     				{
	     					repeater(2);
	     				}
	     				else if (j == 1)
	     				{
	     					repeater(1); 
	     				}
	     			}

	     			else if (input == 2)
	     			{
	     				System.out.println("Please enter your name: ");
	     				String name = reader.nextLine();

	     				System.out.println("Please enter your password: ");
	     				String pass = reader.nextLine();
	     				System.out.println("Welcome, "+ name + "!");
	     			}
	     			else if (input == 3)
	     			{
	     				System.out.println("End of program!");
	     				
	     			} else if ( input == 4 ){ // make a random request 
	     				System.out.println( "Please enter your X coordinte for your location:");
	     				double x = reader.nextDouble();
	     				System.out.println( "Please enter your Y coordinte for your location:");
	     				double y = reader.nextDouble();
	     				cal.randomPassengerRequest(x, y);
	     				
	     				
	     			}
	     		} 
	     		System.out.println("End of program! ");
	     		
	     	} // end of main menu 
	     }// end of class
	     
	     
	     
