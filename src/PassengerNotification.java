
public class PassengerNotification extends Notification{
	public String notify(Driver dr ) {

		String message = "no results.";
		if ( dr != null){
			message = "Notification to Passenger: " +"\n" + " Your request has been processed  "+ "\n" +
					dr.getName() + " will pick you up. " ;
		}
		//return  name + " will pick you up. " ;
		return message;

	}
}
