import java.awt.List;
import java.util.ArrayList;

public class Driver {

	
	boolean leftHome;
	boolean hasRoomInCar ;
	private String name ; 
	private double locationX;
	private double locationY ;
	
	static ArrayList <Driver> drivers = new ArrayList<Driver>(); 
	
	





	public Driver(boolean leftHome, double locationX, double locationY, ArrayList<Driver> drivers) {
		super();
		this.leftHome = leftHome;
		this.locationX = locationX;
		this.locationY = locationY;
		drivers.add(this);
	}

	
	public Driver() {
		// TODO Auto-generated constructor stub
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
}
