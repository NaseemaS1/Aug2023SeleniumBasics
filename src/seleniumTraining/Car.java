package seleniumTraining;

public class Car {
	String name;
	int price;
	String chasisNumber;
	static final int wheels=4;

	public static void main(String[] args) {

		Car c1=new Car();
		c1.name="BMW";
		c1.price=80;
		c1.chasisNumber="12121BMW";
		Car c2=new Car();
		c2.name="Audi";
		c2.price=60;
		c2.chasisNumber="121666Audi";
		Car c3=new Car();
		c3.name="Honda";
		c3.price=50;
		c3.chasisNumber="12122wwHonda";
		
		//Car.wheels=5;
		
		//1.
		System.out.println(wheels);
		System.out.println(c1.name+" "+c1.price+" "+c1.chasisNumber+" "+wheels);
		//2.
		System.out.println(Car.wheels);
		System.out.println(c2.name+" "+c2.price+" "+c2.chasisNumber+" "+wheels);
		//3.
		System.out.println(c1.wheels);//not reccommened

		
		
	}

}
