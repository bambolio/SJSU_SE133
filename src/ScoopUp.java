

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


	static String [] weekDays = {"monday","tuesday","wednesday","thursday","friday"} ;
	static Scanner reader = new Scanner(System.in);

	public static void main(String [] args)
	{
		int[] departures = new int[10];
		int[] arrivals = new int[10];
		//////////////////
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);

		//monday = 2, tuesday = 3, ..
		////////////////////

		Driver driver1 = new Driver( "Muhammed", false,-121.8892602 ,37.5051916 ); // north
		Driver driver2 = new Driver("Jakub" , false,-121.8892602 ,37.2051916 ); // south
		Driver driver3 = new Driver( "Dustin" , false,-122.0 ,37.3351916 ); //east 
		Driver driver4 = new Driver( "Jeet" , false,-122.0 ,37.3151916 ); //west

		// System.out.println( " Arraylist size is : " + Driver.drivers.size() ); // just a test 

		// starts the main menu 
		repeater(1);


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
		Calculation cal = new Calculation() ;

		if (i == 1 )
		{
			System.out.println("|-----------|");
			System.out.println("| Main Menu |");
			System.out.println("|-----------|");
			System.out.println("1. Sign up");
			System.out.println("2. Log in");
			System.out.println("3. Exit");
			System.out.println("4. make a random request");

			

			Member member = new Member();

			int input = 0 ;
			try{
				input = Integer.parseInt(reader.nextLine());
			}catch(Exception e){

			}

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

				System.out.println("Are you willing to drive for ScoopUp?");
				try{
					if(reader.nextLine().equalsIgnoreCase("yes")){
						driverQuestions();
					} 

				}catch(Exception e ){
					e.printStackTrace();
				}



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
				repeater(1);
			}
			else if (input == 3)
			{
				System.out.println("End of program! ");
				return;

			} else if ( input == 4 ){ // make a random request 
				System.out.println( "Please enter your X coordinte for your location:");
				double x = reader.nextDouble();
				System.out.println( "Please enter your Y coordinte for your location:");
				double y = reader.nextDouble();
				cal.randomPassengerRequest(x, y);
				repeater(1);
				
			}
		} 

		else{
			System.out.println("invalid entry!try again.");
			//repeater(1);
		}

	} // end of main menu/repeater 

	private static void driverQuestions() {

		Vehicle vehicle = new Vehicle(); 
		

		System.out.println("Enter your vehicle information: "+"(press enter to skip if you will not)"); 
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
		Driver driver = new Driver();
		
		for (int i = 0 ; i < 5 ; i ++){
			System.out.println("Do you have school on "+weekDays[i]+"?");
			if(reader.nextLine().equalsIgnoreCase("yes") ){
				System.out.println("what time do you need to be in school? (enter 'a' for 'am' and 'p' for 'pm')");
				driver.getArrivalTimes()[i] = reader.nextLine();
				System.out.println("what time do you leave school? (enter 'a' for 'am' and 'p' for 'pm')");
				driver.getDepartureTimes()[i] = reader.nextLine();
				System.out.println("Will you drive on "+weekDays[i]+"s?");
				if (reader.nextLine().equalsIgnoreCase("yes")){
					driver.getIsDriver()[i] = 1 ;
				}
			}
		}



	}

}// end of class



