
public class Billing {
	
	Patient[] patients ;
	Doctor[] doctors ;
	int i = 0;
	int j = 0;
	
	public Billing() {
		super();
		patients = new Patient[3];
		doctors = new Doctor[3];
	}
	
	
	public void enrollPatient(Patient aPatient) {
		if(i<3) {
			patients[i]=aPatient ;
			i++ ;
		}
	}
	
	public void enrollDoctor(Doctor aDoctor) {
		if(j<3) {
			doctors[j]=aDoctor ;
			j++ ;
		}
	}
	
	public double Payment (Patient aPatient) {
		for(Doctor thedoctors:doctors) {
			if(thedoctors.speciality.equals(aPatient.needs)) {
				return thedoctors.wage ;
			}		
		}
		return 0 ;
		
	}
	
	
	
	public void  print() {
		System.out.println("Doctors List:");
		for(Doctor thedoctors:doctors)
			System.out.println(thedoctors.name);
		
		System.out.println("Patient List:");
		for(Patient thepatients:patients)
			System.out.println(thepatients.name);
		
	}
	

}
