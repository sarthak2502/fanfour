package learnjava.sk.oops;

public class Car extends Vehicle {

	public String model;

	public String type;	// private or Commercial

	@Override
	public String toString() {
		return "Car [model=" + model + ", type=" + type + ", noOfWheels=" + noOfWheels + ", fuelType=" + fuelType
				+ ", seatCount=" + seatCount + "]";
	}

}
