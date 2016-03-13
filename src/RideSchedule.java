
import java.util.ArrayList;
import java.util.List;




public class RideSchedule 

{

	private ArrayList<String> routes;

	private ArrayList<Stops> stops;

	private String location;




	/**

	 * Empty Constructor
	 */

	public RideSchedule()

	{

	}




	/**

	 * Set new location

	 * @param location location of pickup

	 */

	public void setLocation(String location)

	{

		this.location = location;

	}




	/**

	 * Get location

	 * @return location

	 */

	public String getLocation()

	{

		return location;

	}




	/**

	 * Add new routes

	 * @param route route to be added

	 */

	public void addRoutes(String route)

	{

		this.routes.add(route);

	}




	/**

	 * Add new date to schedule

	 * @param date date of pickup

	 * @param stop stop location

	 * @param time time of pickup

	 */

//	public void addDay(Integer date, String stop, Integer time)
//
//	{
//
//		Stops temp = new Stops(date);
//
//		temp.addStop(stop, time);
//
//		stops.add(temp);
//
//	}




	/**

	 * Add new stop to schedule

	 * @param date date of pickup

	 * @param stop stop location

	 * @param time time of pickup

	 */

	public void addNewStop(Integer date, String stop, List<Integer> time)

	{

		for(Stops temp: stops){

			if(temp.getDate() == date){

				temp.addStop(stop, time);

			}

		}

	}

}
