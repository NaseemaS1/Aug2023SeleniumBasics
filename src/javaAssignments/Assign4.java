package javaAssignments;

public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * //1.program int i=0; 
		 * while(i<=5) {
		 *  System.out.println("I am Batman");
		 *   i++;
		 */
		//}
		//2.program
		/*
		 * int j=1;
		 *  while(j<=9)
		 *   { System.out.println("I am Batman" +j);
		 *    j++; }
		 */
		//3.program
	//	int k=10;
		/*//using while loop
		while(k>=1) {
			System.out.println(k);
			k--;
		}*/
		//using do while loop
		/*
		 * do { 
		 * System.out.println(k);
		 *  k--; 
		 *  } while(k>=1);
		 */
		//4.program
		/*
		 * int i=0;
		 * 
		 * while(i<=10) { System.out.println("Hello World"); i++; }
		 *///5.program to print all multiplicants of 5 from 1 to 100
		int i = 1;
		/*
		 * while (i <= 100)
		 *  { if (i % 5 == 0)
		 *   { 
		 *   System.out.println(i);
		 * 
		 * }
		 * 
		 * i++;
		 *  }
		 */
		/*do {
			if (i % 5 == 0) {
				System.out.println(i);
				i++;
			}
		} while (i <= 100);
		*/
		for(i=1;i<=100;i++) {
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
		 
		
	}
}
	



