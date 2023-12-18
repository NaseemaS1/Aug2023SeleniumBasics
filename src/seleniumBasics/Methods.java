package seleniumBasics;

public class Methods {
	
	int a;
	int b;
	
	//1.method may not take any paramaters
	//4.method may not return any value
	
	
	/*void sum()
	{
		System.out.println(a+b);
	}
	*/
	
	//2.METHOD takes parameters
	 /*
	   void sum(int x,int y)
	  
	  {
		  a=x;
		  b=y;
		  System.out.println(a+b);
	  }
	  */
	
	//3.Mthod returns some value
	
	int sum()
	{
		return(a+b);
	}
	
	
	
	   public static void main(String args[])
	   {
		   
		   Methods calc=new Methods();
		  
		 //1.method may not take any paramaters
			//4.method may not return any value
			
		 /*  calc.a=100;
		   calc.b=200;
		   calc.sum();
		   */
		   
		   //2.Method takes parameters
		   
		  // calc.sum(100,200);
		
		   //3.Mthod returns some value
		   calc.a=100;
		   calc.b=200;
		   int r=calc.sum();
		   System.out.println(r);
		   
	   }

}

