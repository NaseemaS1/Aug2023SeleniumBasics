package superThisKeyword;

public class car {

	int speed=100;	
	public car() {
		System.out.println("car const...");
	}
	public car(int a) {
		this(10,20);
		System.out.println("car const..."+a);
	}
	public car(int a,int b) {
		this();
		System.out.println("car const..."+(a+b));
	}
	
	
	public void displayInfo() {
		System.out.println("car----Info");
	}
	
}
