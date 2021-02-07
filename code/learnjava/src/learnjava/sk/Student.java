package learnjava.sk;

public class Student {

	public String name;
	public Integer id;
	public Double engMarks;
	public Double hinMarks;
	public Integer count;

	// Default constructor
	public Student() {

	}

	// Parameterized constructor
	public Student(String n, Integer i) {
		name = n;
		id = i;
	}

	// Parameterized constructor
	public Student(String n, Integer i, Double em, Double hm) {
		name = n;
		id = i;
		engMarks = em;
		hinMarks = hm;
	}

	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			
			if (s.name.equals(this.name) && s.id == this.id) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", engMarks=" + engMarks + ", hinMarks=" + hinMarks + "]";
	}

}
