package learnjava.sk.oops;

public class Car extends Vehicle {

	public String model;

	public String type;	// private or Commercial

	@Override
	public Integer add(Integer i, Integer j) {
		return i + j;
	}
	
	public Integer add(Integer i, Integer j, Integer k) {
		return add(i, j) + k;
	}
	
	public void add(Double i, Double j) {
		System.out.println("Hello from the Car!!");
		
	}
	
	public void test() {
		add(8, 8);
		add(8, 8, 7);
		add(1.1, 9.0);
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", type=" + type + ", noOfWheels=" + noOfWheels + ", fuelType=" + fuelType
				+ ", seatCount=" + seatCount + "]";
	}

}
