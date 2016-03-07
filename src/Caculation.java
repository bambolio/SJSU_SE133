import java.util.ArrayList;

/*
 *  37.3351916,-121.8832602 SJSU Y, X coordinates on map which will be used as center (or origin (0,0) ) since all rides end up here. 
 *  this is not the best algorithm and doesn't cover all cases or return home cases.
 *  
 *  
 *  
 *  
 */

public class Caculation {

	
	private double centerX = -121.8832602;	// 	increasing left to right
	private double centerY = 37.3351916; // increasing bottom to top
	
     Driver driver = null ;
     Notification notification = new Notification();


     
    // Driver dirver1 = new Driver(false,-121.8892602 ,37.3451916 );
	
	public String randomPassengerRequest (Double x, Double y){ // x,y location of passenger sending the request
		
		//System.out.println(" random request is called. ");
		if ( Math.abs(centerX - x) < .04 &&  y > centerY ){ // passenger located north of SJSU
			driver = lookForDriver(x , y , "north"); 
			//if (driver != null) // if an ideal driver was found based on location of passenger
		    System.out.println(	notification.sendDriverNotification( x , y  )); // send passenger location to driver as a notification.
			System.out.println(notification.sendPassengerNotification( driver));
			
			
		}else if ( Math.abs(centerX - x) < .04 &&  y < centerY ){ // passenger located south of SJSU
			driver = lookForDriver(x , y , "south" );
			if (driver != null) // if an ideal driver was found based on location of passenger
				 System.out.println(	notification.sendDriverNotification( x , y  )); // send passenger location to driver as a notification.
			     System.out.println(notification.sendPassengerNotification( driver));
			
		}else if ( Math.abs(centerY - y) < .04 &&  x > centerX ){ // passenger located east of SJSU
			driver = lookForDriver(x , y , "east");
			if (driver != null) // if an ideal driver was found based on location of passenger
				 System.out.println(	notification.sendDriverNotification( x , y  )); // send passenger location to driver as a notification.
			     System.out.println(notification.sendPassengerNotification( driver));
			
		}else if ( Math.abs(centerY - y) < .04 &&  x < centerX ){ // passenger located south of SJSU
			driver = lookForDriver(x , y , "west");
			if (driver != null) // if an ideal driver was found based on location of passenger
				 System.out.println(	notification.sendDriverNotification( x , y  )); // send passenger location to driver as a notification.
			     System.out.println(notification.sendPassengerNotification( driver));
			
		} 
		
		
		return null;
	}
	
	public Driver lookForDriver( Double x, Double y , String direction){ 
		
		//System.out.println(" look for driver is called");
		
		Driver driver = null ; // makes a Driver object to store driver information
		
		for( int i = 0 ; i < Driver.drivers.size() ; i ++ ){
			/*
			 * if statements check to see if passenger is located between driver and school. 
			 * in other words is passenger on driver's way to school.  
			 * we can also check to see if the driver has room for passengers or not
			 * sometimes a driver might reach its limit of passengers based on the set schedule that we have. 
			 * and the system has assigned enough passengers to that driver. but if the driver has room then system
			 * considers that driver for random requests. 
			 * hasrRoomInCar can be programmed later. in which case we can just add : && Driver.drivers.get(i).hasRoomInCar  
			 * as a condition in all the if statements. this is ok for now.
			 */
			
			      if ( direction.equalsIgnoreCase("north") && Driver.drivers.get(i).getLocationY()  > y   ){
			    	  //System.out.println("lookfordriver - north");
				driver = Driver.drivers.get(i) ; 
				return driver ;
				//break;
			}else if ( direction.equalsIgnoreCase("south") && Driver.drivers.get(i).getLocationY()  <  y   ){
				// System.out.println("lookfordriver - south");
				driver = Driver.drivers.get(i) ; 
				return driver ;
			}else if ( direction.equalsIgnoreCase("east") && Driver.drivers.get(i).getLocationX()   >  x   ){
				// System.out.println("lookfordriver - east");
				driver = Driver.drivers.get(i) ; 
				return driver ;
			}else if ( direction.equalsIgnoreCase("west") && Driver.drivers.get(i).getLocationX()   <  x  ){
				 //System.out.println("lookfordriver - west");
				driver = Driver.drivers.get(i) ; 
				return driver ;
			}
			
		}
		
		
		return driver;
	}
	
}
