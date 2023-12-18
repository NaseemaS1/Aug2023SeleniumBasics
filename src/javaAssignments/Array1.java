package javaAssignments;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1.program
		
		int p[]= {1,4,5,2,3,22,31,2};
		int a[]= new int[p.length-1];
		int j=0;
		for(int i=0;i<p.length;i++) {
			if(p[i]!=22) {
				a[j]=p[i];
				j++;
				
			}

		}
		System.out.println(Arrays.toString(a));
		
	//2.program 
	/*
	 * Write a program to create a static Array, having following cricket data:
	 * 
	 *                         --name, age, team name, DOB, gender, Strike Rate
	 * 
	 *                         --Try to create multiple Object Arrays for different
	 * players 
	 * 
	 *                         --Try to print all the values of each player on the
	 * console
	 * 
	 */

		Object player1[]=new Object[6];
		player1[0]="sachin";
		player1[1]=32;
		player1[2]="india";
		player1[3]="23-09-1989";
		player1[4]='m';
		player1[5]=82.35;
		Object player2[]=new Object[6];
		player2[0]="Rahul";
		player2[1]=43;
		player2[2]="india";
		player2[3]="08-05-1978";
		player2[4]='m';
		player2[5]=78.95;
		Object player3[]=new Object[6];
		player3[0]="MS dhoni";
		player3[1]=35;
		player3[2]="india";
		player3[3]="09-08-1988";
		player3[4]='m';
		player3[5]=95.23;

		System.out.println(Arrays.toString(player1));
		System.out.println(Arrays.toString(player2));
		System.out.println(Arrays.toString(player3));



	}

}
