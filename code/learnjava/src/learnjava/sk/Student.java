package learnjava.sk;

public class Student {

	public String name;
	public Integer id;
	public Double engMarks;
	public Double hinMarks;
	public Integer count;
	
	//Default constructor
	Student() {
		
	}
	
	//Parameterized constructor
	Student(String n, Integer i) {
		name = n;
		id = i;
	}
	
	//Parameterized constructor
	Student(String n, Integer i, Double em, Double hm) {
		name = n;
		id = i;
		engMarks = em;
		engMarks = hm;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", engMarks=" + engMarks + ", hinMarks=" + hinMarks + "]";
	}
	
}
