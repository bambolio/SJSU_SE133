import java.util.ArrayList;
import java.util.Collections;

public class Member {
	private String username;
	private String password;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	private int status;
	private String address;
	private ArrayList<String> vehicles;
	private int preference; //multiple preferences can be bits
	
	public Member(){
		
	}
	
	/**
	 * Set Status of Member
	 * @param status 0 none, 1 passenger, 2 driver, 3 both
	 */
	public void setStatus(int status){
		this.status = status;
	}
	
	/**
	 * Set Address of member
	 * @param addr Address of member
	 */
	public void setAddress(String addr){
		this.address = addr;
	}
	
	/**
	 * Copy vehicles over into list of vehicles
	 * @param vehicles Initialize Vehicles
	 */
	public void setVehicles(ArrayList<String> vehicles){
		Collections.copy(this.vehicles, vehicles);
	}
	
	/**
	 * Member's preference set
	 * @param preference 
	 */
	public void setPreference(int preference){
		this.preference = preference;
	}
	/**
	 * Get Status of member
	 * @return status
	 */
	public int getStatus(){
		return this.status;
	}
	
	/**
	 * Get address of member
	 * @return member's address
	 */
	public String getAddress(){
		return address;
	}
	
	/**
	 * List of vehicles owned by member
	 * @return a list of vehicles
	 */
	public ArrayList<String> getVehicles(){
		return vehicles;
	}
	
	/**
	 * Preference of member
	 * @return member's preference
	 */
	public int getPreference(){
		return this.preference;
	}
	
	/**
	 * Add new vehicle to list
	 * @param vehicle vehicle to be added
	 */
	public void addVehicle(String vehicle){
		this.vehicles.add(vehicle);
	}
	

}
