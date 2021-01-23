package learnjava.sk.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import learnjava.sk.Student;

public class MainCollection {

	public static void main(String[] args) {

		
		Student st = new Student("ABC", 111, 50.0, 60.0);
		Student st2 = new Student("XYZ", 111, 50.0, 60.0);
		
		// Accepts duplicates, ordered or unordered
		List l = new ArrayList();
		
		l.add(5);
		l.add("Sarthak");
		l.add(8);
		l.add(st2);
		l.add(30.87);
		l.add(st);
		l.add(true);
		
		for (int i = 0; i < 10; i++) {
			
			//l.add(i);
			//System.out.println(i);
		}
		
		System.out.println(l);
		

		// No duplicates
		Set s = new HashSet();
		s.add(5);
		s.add(2);
		s.add(8);
		s.add(3);
		s.add(l);
		
		System.out.println(s);
		
		
		
	}

}
