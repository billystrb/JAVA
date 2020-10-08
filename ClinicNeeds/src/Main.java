
public class Main {

	public static void main(String[] args) {

		
		Patient p1 = new Patient("John","25644","pathologist");
		Patient p2 = new Patient("Maria","89744","acrologist");
		Patient p3 = new Patient("Bill","97410","urologist");

		Doctor d1 = new Doctor("Dr.Jax","acrologist",150);
		Doctor d2 = new Doctor("Dr.Nole","pathologist",140);
		Doctor d3 = new Doctor("Dr.Tara","urologist",170);

		Billing ClinicStatus = new Billing();
		
		ClinicStatus.enrollPatient(p1);
		ClinicStatus.enrollPatient(p2);
		ClinicStatus.enrollPatient(p3);

		ClinicStatus.enrollDoctor(d1);
		ClinicStatus.enrollDoctor(d2);
		ClinicStatus.enrollDoctor(d3);

				
		ClinicStatus.print();
	
		double payment=ClinicStatus.Payment(p1);
		
		System.out.println(p1.name+" has to pay "+payment);
		
		
		
		
	}

}
