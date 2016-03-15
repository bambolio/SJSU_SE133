public class Vehicle {
	private int year;
	private String make;
	private String model;
	private String color;
	private int seatNumber;
	private int parkingNumber;
	private String licensePlate;
	//private Boolean isVerified;
	//private Boolean isOperating;
     
	/** 
	 *  Empty constructor
	 */
	public Vehicle(){
		
	}

	/**
	 * Vehicle Constructor
	 * @param year
	 * @param make
	 * @param model
	 * @param color
	 * @param licensePlate
	 */
	public Vehicle(int year, String make, String model, String color, String licensePlate) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.licensePlate = licensePlate;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the parkingNumber
	 */
	public int getParkingNumber() {
		return parkingNumber;
	}

	/**
	 * @param parkingNumber the parkingNumber to set
	 */
	public void setParkingNumber(int parkingNumber) {
		this.parkingNumber = parkingNumber;
	}

	/**
	 * @return the licensePlate
	 */
	public String getLicensePlate() {
		return licensePlate;
	}

	/**
	 * @param licensePlate the licensePlate to set
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	/**
	 * @return the seatNumber
	 */
	public int getSeatNumber() {
		return seatNumber;
	}

	/**
	 * @param seatNumber the seatNumber to set
	 */
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

}
