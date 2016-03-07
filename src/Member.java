import java.util.ArrayList;
import java.util.Collections;

public class Member {
	private String username;
	private String password;
	private int status;
	private String address;
	private String vehicles;
	private int preference; //multiple preferences can be bits
	private String firstName;
	private String lastName;
	private String cellNumber;
	private String licenseNumber;
	
	public Member(){
		
	}
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
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the cellNumber
	 */
	public String getCellNumber() {
		return cellNumber;
	}
	/**
	 * @param cellNumber the cellNumber to set
	 */
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
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
	 * Preference of member
	 * @return member's preference
	 */
	public int getPreference(){
		return this.preference;
	}
	
	
	/**
	 * @return the licenseNumber
	 */
	public String getLicenseNumber() {
		return licenseNumber;
	}
	/**
	 * @param licenseNumber the licenseNumber to set
	 */
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	/**
	 * @return the vehicles
	 */
	public String getVehicles() {
		return vehicles;
	}
	/**
	 * @param vehicles the vehicles to set
	 */
	public void setVehicles(String vehicles) {
		this.vehicles = vehicles;
	}
	

}
