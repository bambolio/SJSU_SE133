
import java.util.Arrays;

public class MemberSchedule 
{
	private int [] arrival;

	private int [] departure;


	/**

	 * Empty Constructor

	 */
	public MemberSchedule(){

	}

	/**

	 * MemberSchedule constructor

	 * @param arrival arrival times out of 7 days

	 * @param departure departure times out of 7 days

	 */

	public MemberSchedule(int [] arrival, int [] departure)

	{
		setArrival(arrival);

		setDeparture(departure);

	}

	/**

	 * setArrival times for the week

	 * @param arrival arrival times

	 */

	public void setArrival(int [] arrival)	{

		this.arrival = Arrays.copyOf(arrival, arrival.length);

	}


	/**

	 * Set Departure times for the week

	 * @param departure departure times

	 */

	public void setDeparture(int [] departure){
		
		this.departure = Arrays.copyOf(departure, departure.length);
	}

	/**

	 * Set Arrival for 1 of the days

	 * @param day day to be set

	 * @param arrive time to be set

	 */

	public void setArrivalDay(int day, int arrive)

	{

		this.arrival[day] = arrive;

	}




	/**

	 * Set departure for 1 day

	 * @param day day to be set

	 * @param depart departure time to be set

	 */

	public void setDepartureDay(int day, int depart)

	{

		this.departure[day] = depart;

	}




	/**

	 * Get arrival times

	 * @return arrival times

	 */

	public int [] getArrival()

	{

		return arrival;

	}

	/**

	 * Get departure times

	 * @return departure times

	 */

	public int [] getDeparture()

	{

		return departure;

	}

	/**

	 * Get arrival time for 1 day

	 * @param day to get arrival time

	 * @return arrival time for 1 day

	 */

	public int getArrivalDay(int day)

	{

		return arrival[day];

	}


	/**

	 * get departure time for 1 day

	 * @param day to get departure time

	 * @return departure time for 1 day

	 */

	public int getDepartureDay(int day)

	{
		return arrival[day];

	}

}
