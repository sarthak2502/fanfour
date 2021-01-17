//package Hospital.Hospital;

public class Hospital {
	

	public static void main(String s[]) {
		
		Patient pt = new Patient();
		pt.PatientName  ="ABC";
		pt.Age = 35;
		pt.History ="100f Fever";
		pt.Gender ='F';
		pt.PatientId =1;
		
	//	System.out.println(pt);
		
		Department dt = new Department();
		dt.DepartmentName ="PEDO";
		dt.TotalPatients=97;
		dt.p.PatientId=120;
		dt.p.Age =12;
		dt.p.Gender ='F';
		dt.p.History = "Fever";
		dt.p.PatientName ="XYZ";
 //System.out.println(dt);

		 Department dt15 = new Department(200, "MNO");

		
		 Department dt5 = new Department("MNO",100);
		 
		 
		//System.out.println(dt5);
		dt5.p.PatientId = 150;
		dt5.p.Age = 72;
		dt5.p.Gender = 'M';
		dt5.p.History = "Cold";
		dt5.p.PatientName = "QWE";

		//System.out.println(dt5);

		// Department dt2 = new Department("POI","IUY",145,"headache",65,'F',453);

		Department testDept = new Department("POI", new Patient("Mukesh", 60, 'M', new TestMain()), 453);
		
		testDept.p.History = "Do the tests !!!";
		
		//testDept.printDetails();
		String pDetails = testDept.getPatientDetails();
		System.out.println(pDetails);

		System.out.println(testDept);
		
		TestMain t = new TestMain();
		Patient p = new Patient("Rakesh", 34, 'M', t);
		testDept.changePatient(p);
		
		testDept.changePatient(new Patient("Rakesh", 34, 'M', new TestMain()));
		//"POI", new Patient("rakesh", 34, 'M', new TestMain()), 453
		
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

		
//System.out.println(dt2);

Doctor DN1 = new Doctor();
DN1.DoctorName ="JGJ";
DN1.DoctorId =12;
DN1.d.DepartmentName ="PEDO";
DN1.d.p.Age =23;
DN1.d.p.Gender ='M';
DN1.d.p.History="HGF";
DN1.d.p.PatientId=65;
DN1.d.p.PatientName="het";
DN1.d.TotalPatients = 766;
//System.out.println(DN1);

Doctor DN2  = new Doctor("HGF",45);
DN2.d.DepartmentName ="DEO";
DN2.d.p.Age =27;
DN2.d.p.Gender ='F';
DN2.d.p.History="HIF";
DN2.d.p.PatientId=68;
DN2.d.p.PatientName="hat";
DN2.d.TotalPatients = 734;
//System.out.println(DN2);

//Doctor DN3 = new Doctor("PFG",56,"IOY",185,"Backache",95,'M');
//System.out.println(DN3);



		
	}

}

