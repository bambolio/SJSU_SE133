public class ScoopUp {

	public static void main(String [] args){
		int[] departures = null;
		int[] arrivals = null;
		Integer currentDate = 3/1/16;
		
		// Add a Driver
		Member Tim = new Member();
		Tim.setStatus(2);
		Tim.setAddress("1313 Like Ln San Jose CA");
		Tim.addVehicle("2010 Audi A4");
		Tim.setPreference(0);
		departures[0] = 800;
		departures[1]  = 800;
		departures[2] = 800;
		departures[3]  = 800;
		departures[4] = 1100;
		arrivals[0] = 900;
		arrivals[1] = 900;
		arrivals[2] = 900;
		arrivals[3] = 900;
		arrivals[4] = 1200;
		
		// Set Drivers location
//		RideSchedule TimsLocation = new RideSchedule();
//		TimsLocation.setLocation(TimsLocation.getLocation());
		
		// Set Drivers schedule
		MemberSchedule TimsSchedule = new MemberSchedule(arrivals, departures);
		TimsSchedule.setDeparture(departures);
		TimsSchedule.setArrival(arrivals);
		
		// Drivers route
		RideSchedule timsRoute = new RideSchedule();
		
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
		
		// Set Passengers schedule
		MemberSchedule JacksSchedule = new MemberSchedule(arrivals, departures);
		JacksSchedule.setDeparture(departures);
		JacksSchedule.setArrival(arrivals);
		
		// Set Passengers location
		RideSchedule JacksLocation = new RideSchedule();
		JacksLocation.setLocation(JacksLocation.getLocation());
		
		// set a stop on route - book a ride
		JacksLocation.addNewStop(0, JacksLocation.getLocation(), 830); // add a new stop to the schedule

		// Set route
		Stops route = new Stops(0);
		route.addStop(JacksLocation.getLocation(), 830);
		JacksLocation.addNewStop(0, JacksLocation.getLocation(), 830);
		
		//Receive directions
		
		while (currentDate == route.getDate()) {
			
		}
	
	}
}
