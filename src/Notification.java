
public class Notification {

	public String sendDriverNotification (Double x, Double y){
		
		String location = Double.toString(x)+" , " + Double.toString(y) ; // this should be converted to street address later on. 
		
		return " A passenger is on your way and has been assigned to you "+ "\n"+
	   " the location of passenger is : "+ location ;
	}

	
	public String sendPassengerNotification(Driver dr ) {
		
		String message = dr.getName() + " will pick you up. " ;; 
	
		//return  name + " will pick you up. " ;
		return message;
		
	}
}
