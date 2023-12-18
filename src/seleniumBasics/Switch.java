package seleniumBasics;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int day=4;
        /*  switch(day)
          {
          case 1:
        	  System.out.println("Monday");
               break;
          case 2:
        	  System.out.println("tuesday");
              break;
          case 3:
        	  System.out.println("wednesday");
        	  break;
          case 4:
        	  System.out.println("thursday");
        	  break;
          case 5:
        	  System.out.println("friday");
        	  break;
          case 6:
        	  System.out.println("saturday");
        	  break;
          }  
          */
           switch(day)
           {
           case 6:
        	   System.out.println("Today is saturday ");
        	   break;
           case 7:
        	   System.out.println("Today is sunday");
        	   break;
        	default:
        		System.out.println("Looking for the weekend");
        	break;
           }

	}


}
