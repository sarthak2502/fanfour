public class Patient {
	public String PatientName;
	public Integer PatientId;
	public String History;
	public Integer Age;
	public Character Gender;


@Override
public String toString() {
	return "Patient [PatientName=" + PatientName + ", PatientId=" + PatientId + ", History=" + History + ", Age=" + Age
			+ ", Gender=" + Gender + "]";
}



}
