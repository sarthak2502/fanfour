
public class Department {

	public String DepartmentName;
	public Patient p = new Patient();
	public Integer TotalPatients;
	public Integer phone;

	Department() {
		
	}
	
	Department(String n, Patient pt1, Integer TP){
		DepartmentName =n;
		p=pt1;
		TotalPatients=TP;
	}
		
	Department(String dpn, Integer TPN ){
		DepartmentName =dpn;
		TotalPatients = TPN;
	}
	
	Department(Integer phone, String dpn){
		DepartmentName =dpn;
		this.phone = phone;
	}

	public String getPatientDetails() {
		String details;
				
		p.Age = p.Age + 1;
		
		details = p.PatientName + ", " + p.History + ", " + p.Age;
		
		//System.out.println(details);
		
		return details;
	}
	
	public void changePatient(Patient p2) {
		
		this.p = p2;
		
	}

	public void changePatientDetails(String name, String history) {
		this.p.PatientName = name;
		this.p.History = history;
	}

	
	public void changePatientName(Patient p2) {
		this.p.PatientName = p2.PatientName;
	}

	public void changePatientName(String name) {
		this.p.PatientName = name;
	}

	public void changePatienthistory(String history) {
		this.p.History = history;
	}

	public void printDetails() {
		DepartmentName = "LAB";
		
		System.out.println(DepartmentName);
	}
	
	public String toString() {
		return "Department [DepartmentName=" + DepartmentName + ", p=" + p + ", TotalPatients=" + TotalPatients + "]";
	}
		
}
