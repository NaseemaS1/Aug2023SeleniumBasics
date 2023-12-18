package javaAssignments;

/*8. Write a program to print the factorial of a number by defining a method named 'Factorial'.

Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-

4! = 1*2*3*4 = 24

3! = 3*2*1 = 6

2! = 2*1 = 2 

Also,

1! = 1

0! = 1*/

/*

 1
 1*2
 1*2*3
 1*2*3*4
 1*2*3*4*5

 */

public class Methods5 {

	public void Factorial(int n) {
		int k = 1;
		
		for(int i=1;i<=n;i++)
		{
			k = k*(i);
		}
		System.out.println(k);


	}

	public static void main(String[] args) {

		Methods5 m = new Methods5();
		m.Factorial(5);
		m.Pattern(5);

	}

	public void Pattern(int p)
	{
		//System.out.println(1);
		for(int i=1;i<=p;i++)
		{
			for(int j=i;j<=i;j++)
			{
				System.out.print(j);
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
	
	
	
}
