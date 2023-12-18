package ConstructorConcept;

public class Employee {
	
	String name;
	int id;
	double salary;
	//public Employee() {
		//System.out.println("Default Constructor");
	//}

	//public Employee(int a) {
		//System.out.println("1 param Constructor"+a);
	//}
	public Employee(String name) {
		this.name=name;//this.G=l
	}
	public Employee(String name,int id) {
	    this.name=name;
		this.id=id;
	}
	public Employee(String name,int id,double salary) {
	    this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public void test() {
		System.out.println("test method");
	}

	public static void main(String[] args) {
		
		Employee e1=new Employee("Tom");
		System.out.println(e1.name+" "+e1.id+" "+e1.salary);
		
		Employee e2=new Employee("Kiran",200);
		System.out.println(e2.name+" "+e2.id+" "+e2.salary);
		
		Employee e3=new Employee("Rahul",201,23.44);
		System.out.println(e3.name+" "+e3.id+" "+e3.salary);

		
		
		
	}

}
