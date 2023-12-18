package oops_Interface;

public class TestHosiptal {

	public static void main(String[] args) {

		FortisHosiptal fh=new FortisHosiptal();
		fh.dentalServices();
		fh.ENTServices();
		fh.physioServices();
		fh.pediaServices();
		fh.emergencyServices();
		fh.oncologyServices();
		fh.orthoServices();
		fh.gynoServices();
	    fh.medicalInsurance();
		fh.medicaltraining();
		System.out.println(UkServices.min_fee);
		System.out.println(fh.min_fee);
		
		UkServices.billing();
		FortisHosiptal.billing();
		fh.medicalNewsPublish();
		fh.covidVaccination();
		
		
		
		//top casting:child object can be refered by parent interface ref variable
		UsServices US=new FortisHosiptal();
		US.pediaServices();
		US.physioServices();
		US.oncologyServices();
		US.emergencyServices();
		
		UkServices UK=new FortisHosiptal();
		UK.dentalServices();
		UK.emergencyServices();
		UK.orthoServices();
	}

}
