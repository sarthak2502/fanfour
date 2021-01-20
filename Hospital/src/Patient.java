public class Patient {
	public String PatientName;
	public Integer PatientId;
	public String History;
	public Integer Age;
	public Character Gender;
	public Integer patientfees;

	Patient() {
	}

	Patient(Integer pf) {
		patientfees = pf;
	}

	public Integer Fees() {
		Integer fee = 500;

		return fee;
	}

	@Override
	public String toString() {
		return "Patient [PatientName=" + PatientName + ", PatientId=" + PatientId + ", History=" + History + ", Age="
				+ Age + ", Gender=" + Gender + "]";
	}

}
