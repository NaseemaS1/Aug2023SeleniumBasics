package seleniumBasics;

public class ForLOOP 
{
	
	public static void main(String[] args)
		{
		int i, j;
		
		/*
		 * for(i=0;i<=10;i++) { System.out.println(i); }
		 */
		/* nested loop */
		 /*for (i = 0; i <= 3; i++) 
			{
				System.out.println("outer:" + i);

				for (j = 0; j <= 3; j++)
				{
					System.out.println("inner:" + j);
				}
		
			}
			*/
		int sum=0;
		String[] names= {"java","c","c++","Phyton","javascript"};
		for( j=1;j<=10;j++)
		{
			sum=sum+j;
		}
			System.out.println("The sum of first 10 natural numbers is:"+sum);
			
       for(String name:names)
       {
    	   System.out.println(name);
       }
	}

}
