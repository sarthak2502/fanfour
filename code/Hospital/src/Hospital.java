//package Hospital.Hospital;

public class Hospital {
	

	public static void main(String s[]) {
		
		Patient pt = new Patient();
		
		Department dt = new Department();
		
		Department testDept = new Department("POI", new Patient("Mukesh", 60, 'M', new TestMain()), 453);
		
		testDept.p.History = "Do the tests !!!";
		
				String pDetails = testDept.getPatientDetails();
		System.out.println(pDetails);

		System.out.println(testDept);
		
		TestMain t = new TestMain();
		Patient p = new Patient("Rakesh", 34, 'M', t);
		testDept.changePatient(p);
		
		testDept.changePatient(new Patient("Rakesh", 34, 'M', new TestMain()));
		
		String p2Details = testDept.getPatientDetails();
		System.out.println(p2Details);
		
		System.out.println(testDept);

		testDept.changePatientName("Suresh");
		testDept.changePatienthistory("Paracetamol");

		System.out.println(testDept.getPatientDetails());
		
		testDept.changePatienthistory("Suresh/Doing Fine");

		System.out.println(testDept.getPatientDetails());

		testDept.changePatientDetails("Suresh", "OK Fine");
		
		System.out.println(testDept.getPatientDetails());

		Doctor DN1 = new Doctor();
	}

}

