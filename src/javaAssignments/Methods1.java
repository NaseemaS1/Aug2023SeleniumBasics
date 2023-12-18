package javaAssignments;

public class Methods1 {
	// 2. Define a method that returns the product of two double numbers entered by
	// user.
	public double product(double a, double b) {
		System.out.println("Product of two numbers:");
		double p = a * b;
		return p;
	}

	// 3.Write a program to print the circumference and area of a circle of radius
	// entered by user by defining your own method. 
	public double circunference(int r) {
		System.out.println("Circumfrernce of a circle");
		double cir = 2 * (3.14) * r;
		return cir;
	}

	public double area(int r) {
		System.out.println("Area of the circle");
		double a = (3.14) * r * r;
		return a;
	}

	public static void main(String[] args) {

		Methods1 r = new Methods1();
		double p1 = r.product(5.6, 6.8);
		System.out.println(p1);
		double p2 = r.circunference(7);
		System.out.println(p2);
		double p3 = r.area(7);
		System.out.println(p3);

	}

}
