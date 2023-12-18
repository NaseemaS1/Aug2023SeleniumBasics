package superThisKeyword;

public class BMW extends car {
	
	int speed=200;
	
	public BMW() {
		super(20,30);
		System.out.println("bmw const....");
	}
	public BMW(int p) {
		this();
		System.out.println("bmw const....");
	}
	
	
	public void displayInfo() {
		System.out.println("bmw.....Info");
	}
	
	public void displayBMWInfo() {
		System.out.println("car----Info");
		System.out.println(speed);
		System.out.println(super.speed);
		displayInfo();
		super.displayInfo();
	}
	
}
