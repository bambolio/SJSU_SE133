import java.awt.List;
import java.util.ArrayList;

public class Driver {

	
	boolean leftHome;
	boolean hasRoomInCar ;
	private String name ; 
	private double locationX;
	private double locationY ;

	private String[] arrivalTimes = new String[5];
	private String[] departureTimes = new String[5];
	private int[] isDriver = new int[5];
	
	static ArrayList <Driver> drivers = new ArrayList<Driver>(); 
	

	public Driver(String name , boolean leftHome, double locationX, double locationY) {
		super();
		this.leftHome = leftHome;
		this.locationX = locationX;
		this.locationY = locationY;
		this.name = name ;
		drivers.add(this);
	}

	
	public Driver() {
		
	}


	public boolean isLeftHome() {
		return leftHome;
	}




	public void setLeftHome(boolean leftHome) {
		this.leftHome = leftHome;
	}




	public double getLocationX() {
		return locationX;
	}




	public void setLocationX(double locationX) {
		this.locationX = locationX;
	}




	public double getLocationY() {
		return locationY;
	}




	public void setLocationY(double locationY) {
		this.locationY = locationY;
	}


	public static ArrayList<Driver> getDrivers() {
		return drivers;
	}


	public static void setDrivers(ArrayList<Driver> drivers) {
		Driver.drivers = drivers;
	}


	public void getNotification (){ 
		
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String[] getArrivalTimes() {
		return arrivalTimes;
	}


	public void setArrivalTimes(String[] arrivalTimes) {
		this.arrivalTimes = arrivalTimes;
	}


	public int[] getIsDriver() {
		return isDriver;
	}


	public void setIsDriver(int[] isDriver) {
		this.isDriver = isDriver;
	}

	

	public String[] getDepartureTimes() {
		// TODO Auto-generated method stub
		return departureTimes;
	}


	public void setDepartureTimes(String[] departureTimes) {
		this.departureTimes = departureTimes;
	}
}
