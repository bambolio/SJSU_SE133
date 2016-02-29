import java.util.HashMap;

public class Stops {
	private Integer date;
	private HashMap<String, Integer> stops;

	/**
	 *  Constructor
	 *  @param date to be picked up
	 */
	public Stops(Integer date){
		this.date = date;
	}
	
	/**
	 * Set date of pickup
	 * @param date day to be picked up
	 */
	public void setDate(Integer date){
		this.date = date;
	}
	/**
	 * Add a stop request
	 * @param stop stop location
	 * @param time time to be picked up
	 */
	public void addStop(String stop, Integer time){
		stops.put(stop, time);
	}
	
	/**
	 * Remove stop from list
	 * @param stop stop location to be removed
	 */
	public void removeStop(String stop){
		stops.remove(stop);
	}
}
