package learnjava.sk.oops;

public class Vehicle {

	public Integer noOfWheels;

	public String fuelType;

	public Integer seatCount;

	
	Integer calculateAvailableSeats() {
		
		// Some calculations happen here..
		
		return (seatCount - 1);
		
	}
}
