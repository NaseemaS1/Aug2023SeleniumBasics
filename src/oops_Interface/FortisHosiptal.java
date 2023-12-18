package oops_Interface;

public class FortisHosiptal extends Medical implements UkServices,UsServices,IndianServices {
	
	int min_fee=50;
	
	
	public void dentalServices()
	{
		System.out.println("FH----dentalServices");
		
	}
	public void orthoServices() {
		
		System.out.println("FH----orthoServices");
	}
	public void physioServices() {
		
		System.out.println("FH----physioServices");
	}
	public void oncologyServices() {
		
		System.out.println("FH----oncologyServices");
	}

	public void pediaServices() {
		
		System.out.println("FH----pediaServices");
		
	}
	public void ENTServices() {
		
		System.out.println("FH----ENTServices");
		
	}
	public void gynoServices() {
		
		System.out.println("FH----gynoServices");
		
	}
	
	public void emergencyServices() {
		
		System.out.println("FH---emergencyServices");
	}
	
	public void medicalInsurance() {
		
		System.out.println("FH---medicalInsurance");
	}
	public void medicaltraining() {
		
		System.out.println("FH---medicalTraining");
	}
	
    //method hiding
	public static void billing() {
		System.out.println("FH---billing");
	}
	
	public void RnD() {
		System.out.println("FHM---R&D");
	}
	@Override
	public void covidVaccination() {
		System.out.println("FH---covidVaccination");
	}
	


}
