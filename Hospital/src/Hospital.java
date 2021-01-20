//package Hospital.Hospital;

public class Hospital {

	public static void main(String s[]) {

		Patient pt = new Patient();

		Department dt = new Department();

		Doctor DN1 = new Doctor();

		Department revenue = new Department(465);
		Department revenue_1 = new Department(100, new Patient(100));
		Department revenue_2 = new Department("ABC", new Patient(100), 100);

		System.out.println(revenue.Revenue());
		System.out.println(revenue_1.Revenue_1());
		System.out.println(revenue_2.Revenue_1());
	}

}
