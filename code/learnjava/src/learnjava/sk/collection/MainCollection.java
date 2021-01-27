package learnjava.sk.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import learnjava.sk.School;
import learnjava.sk.Student;

public class MainCollection {

	public static void main(String[] args) {

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

}
