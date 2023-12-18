package javaAssignments;

public class Assign4part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * //6.program for(int i=0;i<=100;i++) { if(i%2==0) { System.out.println(i +" "
		 * + "Even number" ); } else { System.out.println(i +" "+ "odd number"); } }
		 */
		// 7.program
		/*
		 * int i = 1;
		 * 
		 * 
		 * while(i<=1){
		 * 
		 * System.out.println("Hi Java");
		 * 
		 * }
		 */

		// 8.program to print ascii values of A-Z,a-z,0-9
		/*
		 * for(char a='A';a<='Z';a++) { System.out.println(a +" " +(int)a);
		 * 
		 * } for(char b='a';b<='z';b++) { System.out.println(b+" "+(int)b); } for(char
		 * c='0';c<='9';c++) { System.out.println(c+" "+(int)c); }
		 */
		// using while loop
		/*
		 * char a='a'; while(a<='z') { System.out.println(a+" "+(int)a); a++; }
		 */
		// 9.print only vowels using for loop and while loop

		/*
		 * char x = 'a'; while (x <= 'z') { if (x == 'a' || x == 'e' || x == 'i' || x ==
		 * 'o' || x == 'u') { System.out.println(x);
		 * 
		 * } else { System.out.println("Char is a consonant: " + x);
		 * 
		 * } x++; }
		 */

		// print consonants using AND operator and loops

		/*
		 * char x1 = 'a'; while (x1 <= 'z') { if (x1!='a'&& x1!='e'&& x1!='i'&& x1 !=
		 * 'o'&& x1 != 'u') { System.out.println(x1); } x1++; }
		 */

		/*
		 * for (char j = 'a'; j <= 'z'; j++) { if (j == 'a' || j == 'e' || j == 'i' || j
		 * == 'o' || j == 'u') { System.out.println(j); }
		 * 
		 * }
		 */
	  //Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
	

		
		
		  for (int i = 1; i <= 10; i++) 
		  {
			  System.out.println(i);
			  
			  do {
				  
				  if (i % 7 ==0) 
				  	{
			  
				  System.out.println("bye see u tomorrow");
					  break;
				  	}
			
			       }while(1==2);
			    	   
			  }
		  
	//Print the following series: 

	/*
	 * 1.0 2.0 3.0  ...... 10.0 
	 * 
	 * 0 9 18 27 36 …99
	 */
		  for(double i=1.0;i<=10.0;i++) {
			  System.out.println(i);
		  }
		  
		  for(int i=1;i<=11;i++) {
			  int k=i*9;
			  System.out.println(k);
		  }
		  
		 	}
	

}



