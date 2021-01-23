package learnjava.sk.oops;

public class Bike extends Vehicle {

	public String name;

	@Override
	public String toString() {
		return "Bike [name=" + name + ", noOfWheels=" + noOfWheels + ", fuelType=" + fuelType + ", seatCount="
				+ seatCount + "]";
	}

}
