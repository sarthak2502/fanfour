package learnjava.sk;

public class School {

	public String name;
	public Student st = new Student();

	public School() {

	}

	public School(String s, Student sd) {
		name = s;
		st = sd;

	}

	@Override
	public String toString() {
		return "School [name = " + name + ", student = " + st + "]";
	}

}
