package learnjava.sk;

public class School {

	public String name;
	public Student st = new Student();
	
	
	@Override
	public String toString() {
		return "School [name = "+name+", student = "+ st +"]";
	}
	 
}
