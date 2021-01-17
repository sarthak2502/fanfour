
public class Doctor {
	
	public String DoctorName;
	public Integer DoctorId;
	public Department d = new Department();
	
	Doctor(){
		
	}
	
	Doctor(String DN, Integer DI, Department DT){
		DoctorName = DN;
		DoctorId =DI;
		d = DT;
	}
	
	Doctor(String DN, Integer DI ){
		DoctorName = DN;
		DoctorId =DI;

	}
	@Override
	public String toString() {
		return "Doctor [DoctorName=" + DoctorName + ", DoctorId=" + DoctorId + ", d=" + d + "]";
	}
	

}
