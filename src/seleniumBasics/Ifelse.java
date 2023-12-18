package seleniumBasics;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     if(20>18)
     {
    	 System.out.println("20 is greater than 18");
     }
     int x=20;
     int y=18;
     if(x>y)
     {
    	 System.out.println("x is greater than y");
     }
     int time=20;
     if(time<18)
     {
    	 System.out.println("good morning");
     }
     else 
     {
    	 System.out.println("good evening");
     }
     int t1=22;
     if(t1<10)
     {
    	 System.out.println("good morning");
     }
     else if(t1<18)
     {
    	 System.out.println("good day");
     }
     else
     {
    	 System.out.println("good evening");
     }
   
     /*short hand if else*/
     int time1=21;
     String result=(time1<18)?"good day":"good evening";
     System.out.println(result);
     
     
     
	}

}
