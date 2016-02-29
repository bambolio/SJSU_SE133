import java.util.ArrayList;
import java.util.HashMap;

public class RideSchedule {
	private ArrayList<String> routes;
	private ArrayList<Stops> stops;
	private String location;

	
	public RideSchedule(){
		
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	public String getLocation(){
		return location;
	}
	
	public void addRoutes(String route){
		this.routes.add(route);
	}

	public void addDay(Integer date){
		Stops temp = new Stops(date);
		stops.add(temp);
	}
	
	public void addStop(Integer date, String stop, Integer time){
		
	}
	
	

}
