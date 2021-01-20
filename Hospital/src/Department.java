
public class Department {

	public String DepartmentName = "Default Department for my app";
	public Patient p = new Patient();
	public Integer TotalPatients;

	Department() {
	};

	Department(String n, Patient pt1, Integer TP) {
		DepartmentName = n;
		p = pt1;
		TotalPatients = TP;

	};

	Department(Integer TP) {
		TotalPatients = TP;
	};

	Department(String DepartmentName, Integer TotalPatients) {
	};// -- NEED TO ASK
	/*
	 * Department(String dpn, Integer TPN ){ DepartmentName =dpn; TotalPatients =
	 * TPN; };
	 */

	Department(Integer tp, Patient pt1) {
		p = pt1;
		TotalPatients = tp;

	};

	public String Revenue() {

		String revenuedetails;
		Integer totalrevenue = TotalPatients * p.Fees();
		revenuedetails = "Total revenue of " + DepartmentName + " is" + " " + totalrevenue;
		return revenuedetails;
	}

	public String Revenue_1() {

		String revenuedetails;
		System.out.println(p.patientfees);
		Integer totalrevenue = TotalPatients * p.patientfees;
		revenuedetails = "Total revenue of " + DepartmentName + " is" + " " + totalrevenue;
		return revenuedetails;
	}

	@Override
	public String toString() {
		return "Department [DepartmentName=" + DepartmentName + ", p=" + p + ", TotalPatients=" + TotalPatients + "]";
	}

}
