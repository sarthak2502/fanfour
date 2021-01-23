package learnjava.sk.oops;

public class MainOops {

	public static void main(String[] args) {

		Vehicle c = new Car();
		Vehicle b = new Bike();

		c.seatCount = 4;
		
		b.seatCount = 2;
		
		System.out.println(c.calculateAvailableSeats());

			
		System.out.println(b.calculateAvailableSeats());
	}

}
