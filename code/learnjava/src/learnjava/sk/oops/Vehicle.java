package learnjava.sk.oops;

public class Vehicle {

	public Integer noOfWheels;

	public String fuelType;

	public Integer seatCount;

	public void display() {
		System.out.println("Hello from the Vehicle !!");
	}

	public Integer add(Integer i, Integer j) {
		return i + j;
	}
	
	Integer calculateAvailableSeats() {
		
		// Some calculations happen here..
		
		return (seatCount - 1);
		
	}
}
