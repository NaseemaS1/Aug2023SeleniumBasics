package oops_Interface;

public interface UkServices {
	
	int min_fee=10;//static and final by defualt

	public void dentalServices();
	public void orthoServices();
	public void emergencyServices();
	
	
	//after jdk1.8
	//two major changes
	//can have ststic method with method body
	public static void billing() {
		//buss logic
		System.out.println(	"UKM billing ");
	}
	
	//can have defualt method with method body:non static
	
	default void RnD() {
		System.out.println("UKM---R&D");
	}
	

}
