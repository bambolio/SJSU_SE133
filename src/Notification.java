
public class Notification {

	public String sendDriverNotification (Double x, Double y){
		
		String location = Double.toString(x)+" , " + Double.toString(y) ; // this should be converted to street address later on. 
		
		return "Notification to Driver: " +"\n" +" A passenger has been assigned to you "+ "\n"+
	   " The location of passenger is : "+ location +"\n";
	}

	
	public String sendPassengerNotification(Driver dr ) {
		
		String message = "Notification to Passenger: " +"\n" + " Your request has been processed  "+ "\n" +
		dr.getName() + " will pick you up. " ;
	
		//return  name + " will pick you up. " ;
		return message;
		
	}
}
