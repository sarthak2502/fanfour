
public class Department {

	public String DepartmentName;
	public Patient p = new Patient();
	public Integer TotalPatients;

	Department() {};
	Department(String n, Patient pt1, Integer TP ){
		DepartmentName =n;
		p=pt1;
		TotalPatients=TP;
		
	};
	
//	Department(String DepartmentName, Integer TotalPatients ){};-- NEED TO ASK
	Department(String dpn, Integer TPN ){
	DepartmentName =dpn;
	TotalPatients = TPN;
	};
	
	
	
	@Override
	public String toString() {
		return "Department [DepartmentName=" + DepartmentName + ", p=" + p + ", TotalPatients=" + TotalPatients + "]";
	}
		
}
