
public class DriverNotification extends Notification{

	public String notify(Double x, Double y){
		String location = Double.toString(x)+" , " + Double.toString(y) ; // this should be converted to street address later on. 
		
		return "Notification to Driver: " +"\n" +" A passenger has been assigned to you "+ "\n"+
	   " The location of passenger is : "+ location +"\n";
	}

}
