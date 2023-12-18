package javaAssignments;

//1.Write a program to print the addition/subtraction/division/multiplication of two numbers entered by user by defining your own method

public class Methods {
	public int add(int a, int b) {
		System.out.println("sum of two numbers:");
		int sum = a + b;
		return sum;
	}

	public int sub(int a, int b) {
		System.out.println("subtraction of two numbers:");
		int sub = a - b;
		return sub;
	}

	public int div(int a, int b) {
		System.out.println("Division of two numbers:");
		int div = a / b;
		return div;
	}

	public int mul(int a, int b) {
		System.out.println("Multiplication of two numbers:");
		int mul = a * b;
		return mul;

	}

	public static void main(String[] args) {

		Methods u1 = new Methods();
		int t1 = u1.add(80, 90);
		System.out.println(t1);
		int t2 = u1.sub(80, 50);
		System.out.println(t2);

		int t3 = u1.div(45, 5);
		System.out.println(t3);

		int t4 = u1.mul(69, 8);
		System.out.println(t4);

	}

}
