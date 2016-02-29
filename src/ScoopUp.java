
public class ScoopUp {

	public static void main(String [] args){
		
		// Adding a driver
		Member Tim = new Member();
		Tim.setStatus(2);
		Tim.setAddress("1313 Like Ln San Jose CA");
		Tim.addVehicle("2010 Audi A4");
		Tim.setPreference(0);
		
		// Adding a passenger
		Member Jack = new Member();
		Jack.setStatus(1);
		Jack.setAddress("636 Milky Way Ln San Jose CA");
		Jack.setPreference(0);
		
		
	}
}
