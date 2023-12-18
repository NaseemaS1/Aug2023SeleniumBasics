package javaAssignments;

public class User {
   
	String name;
	int age;
	String city;
	public static void main(String[] args) {

		User u1=new User();
		u1.name="Rahul";
		u1.age=32;
		u1.city="Delhi";
		User u2=new User();
		u2.name="David";
		u2.age=37;
		u2.city="Calcutta";
		User u3=new User();
		u3.name="Pooja";
		u3.age=25;
		u3.city="Bangalore";
		User u4=new User();
		u4.name="Ravi";
		u4.age=28;
		u4.city="Kerala";
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		System.out.println("------------------");
		u1=u2;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		System.out.println("------------------");

		u2=u3;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		System.out.println("------------------");

		u3=u4;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		System.out.println("------------------");

		u4=u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		
		
		
	}

}
