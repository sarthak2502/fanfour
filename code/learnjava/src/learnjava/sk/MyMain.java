package learnjava.sk;

public class MyMain {
	
	public static void main (String s[]) {
		
		Student s1 = new Student();
		s1.id = 100;
		s1.name = "Sarthak";
		s1.engMarks = 72.8;
		s1.hinMarks = 82.1;
		
		School sch = new School();
		
		sch.name = "ABC School";
		
		sch.st.name = "XYZ";
		sch.st.id = 111;
		sch.st.engMarks = 60.5;
		sch.st.hinMarks = 70D;
		
		System.out.println(sch);

		City c = new City();
		
		c.sc.st.name = "Karan";
		c.sc = sch;
				
		System.out.println(c);
		
		sch.st.engMarks = 0.0;

		System.out.println(sch);
		System.out.println(c);

		
		/*s1.name = "Lovy";

		System.out.println(s1);
		
		
		Student s2 = new Student("Sudeep", 200, 80.0);
		
		System.out.println(s2);
		
		s2.name = "Gurpreet";
		s2.id = 300;

		System.out.println(s2);*/

	}

}
