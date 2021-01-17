public class Patient {
	public String PatientName;
	public Integer PatientId;
	public String History;
	public Integer Age;
	public Character Gender;
	public TestMain test;

	Patient () {
		
	}
	
	Patient (String name) {
		PatientName = name;
	}
	
	Patient (String name, Integer age, Character Gender, TestMain test) {
		
		PatientName = name;
		Age = age;
		this.Gender = Gender;
		this.test = test;
		
	}
	

@Override
public String toString() {
	return "Patient [PatientName=" + PatientName + ", PatientId=" + PatientId + ", History=" + History + ", Age=" + Age
			+ ", Gender=" + Gender + "]";
}



}
