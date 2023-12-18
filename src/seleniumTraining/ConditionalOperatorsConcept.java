package seleniumTraining;

public class ConditionalOperatorsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=20;
     if(a==10)
     {
    	 System.out.println("Hi");
	 
     }
     else {
    	 System.out.println("bye");
     }
     
  /*   int x=100;
     //int y=100;
    // if(x==y) {
    	 System.out.println("testing");
     }
     if(true) {
    	 System.out.println("Hello selenium");
    	 
     }
     else {//dead code
    	 System.out.println("bye selenium");
     }*/
     boolean flag=true;
     if(flag)
     {
    	 System.out.println("Hello selenium");
     }
     else {
    	 System.out.println("bye selenium");
     }
     
     int g=100;
     int h=200;
     if(h>g)
     {
    	 System.out.println("h is greater than g");
     }
     else {
    	 System.out.println("g is greater than h");
     }
     
     int x=700;
     int y=900;
     int z=600;
     
     if(x>y && y>z)
    	 {
    	 System.out.println("x is the greatest");
    	 }
     if(y>z) {
    	 System.out.println("y is the greatest");
     }
     else {
    	 System.out.println("z is the greatest");
     }
     
	}

}
