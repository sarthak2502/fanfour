package learnjava.sk.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import learnjava.sk.School;
import learnjava.sk.Student;
import learnjava.sk.oops.Car;

public class MainCollection {

	public static void main(String[] args) {

		// learnCollections();

//		learnGenerics();
		//engavg();
		//hinavg();
		
		testSetValues();
	}

	public static void learnCollections() {

		Student st = new Student("ABC", 111, 50.0, 60.0);
		Student st2 = new Student("XYZ", 111, 50.0, 60.0);
		Student st3;
		st3 = st2;
		School sc = new School("DAV", st);

		// Accepts duplicates, ordered or unordered
		List l = new ArrayList();

//		l.add(5);
//		l.add("Sarthak");
//		l.add(8);
//		l.add(st2);
//		l.add(30.87);
		l.add(st);
//		l.add(true);
		l.add(st2);
		l.add(st3);
		l.add(4 + 5);
		l.add(4 * 6);
		l.add(8 / 5);
		l.add(sc);
		for (int i = 0; i < 10; i++) {

			// l.add(i);
			// System.out.println(i);
		}

		System.out.println(l);

		// No duplicates
		Set s = new HashSet();
//		s.add(5);
//		s.add(2);
//		s.add(8);
//		s.add(3);
//		s.add(l);
		s.add(st);
		s.add(st2);
		s.add(st3);
		s.add(4 + 5);
		s.add(9);
		s.add(14);
		s.add(4 * 6);
		s.add(90 / 10);
		s.add(8 / 5);
		s.add(sc);
		System.out.println(s);

	}

	public static void learnGenerics() {

		Integer i = 90;

		List<Integer> l = new ArrayList<>();

		l.add(1);
		l.add(3);
		l.add(i);

		// System.out.println(l);
		// Student[] arr = new Student[10];

		List<Student> ls = new ArrayList<>();

		for (Integer j = 0; j < 10; j++) {
			Student st = new Student("ABC" + j, 100 + j);
			ls.add(st);
		}
		System.out.println("List populated successfully. List size = " + ls.size());

		Integer sum = 0;
		for (Integer j = 0; j < ls.size(); j++) {
			Student st = ls.get(j); // ls[j]
			sum = sum + st.id;
			System.out.println(st);
			// ls.remove(st);
		}
		System.out.println(sum);
		// System.out.println(ls);

	}

	public static void engavg() {

		List<Student> ls = new ArrayList<>();
		Set<Student> s = new HashSet<>();
		double sum = 0.0;
		double average = 0.0;
		for (Integer i = 0; i < 10; i++) {
			Student sc = new Student("ABC" + i, 1 + i, 56.0 + i, 67.0 + i);
			ls.add(sc);
		}
		for (Integer i = 0; i < ls.size(); i++) {
			Student sc = ls.get(i);
			sum = sum + sc.engMarks;
			System.out.println(sc.engMarks);
			s.add(ls.get(i));
		}
		average = sum / ls.size();
		System.out.println("Average of English Marks is:" + average);

		System.out.println("Values of List added in Set");

		for (Student s1 : s) {
			System.out.println(s1);
		}

//		System.out.println(s); // giving null pointer exception

	}

	public static void hinavg() {

		List<Student> ls = new ArrayList<>();
		double sum = 0.0;
		double average = 0.0;
		for (Integer i = 0; i < 10; i++) {
			Student sc = new Student("ABC" + i, 1 + i, 56.0 + i, 67.0 + i);
			ls.add(sc);
		}
		for (Integer i = 0; i < ls.size(); i++) {
			Student sc = ls.get(i);
			sum = sum + sc.hinMarks;
			System.out.println(sc.hinMarks);
		}
		average = sum / ls.size();
		System.out.println("Average of Hindi Marks is:" + average);

		System.out.println("Printing Sets value if inserting the same value");
		samesetvalue();

	}

	public static void samesetvalue() {
		List<Student> ls = new ArrayList<>();
		Set<Student> s = new HashSet<>();

		for (Integer i = 0; i < 10; i++) {
			Student sc = new Student("ABC" + i, 1 + i, 56.0 + i, 67.0 + i);
			ls.add(sc);

		}
		for (Integer i = 0; i < ls.size(); i++) {
			s.add(ls.get(1));
		}
//		for (Student s1 : s) {
//			System.out.println(s);
//		}

		System.out.println(s);
	}
	
	public static void testSetValues() {
		Set<String> s1 = new HashSet<>();
		s1.add("ABC");
		s1.add("ABC");
		
		System.out.println(s1);
		
		Set<Student> s = new HashSet<>();
		
		Student st1 = new Student("Sarthak", 100);
		Student st2 = new Student("Sarthak", 101);
		Student st3 = new Student("Sarthak", 100);
		Student st4 = st3;

		//System.out.println(st4);
		
		s.add(st1);
		s.add(st2);
		s.add(st3);
		s.add(st4);

		System.out.println(s);
		
		
		Car c = new Car();
		c.test();
		c.display();
		
		String str = "aa";
	}


}
