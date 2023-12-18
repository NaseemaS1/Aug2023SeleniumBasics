package ExceptionHandling;

public class Employee {
	
	String name;
	
	public static void main(String[] args) {
		
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
        try {
        	
        Employee obj=new Employee();
        obj=null;
        obj.name="Tom";
		int i=9/0;
		System.out.println("Hello");
		

        }
        catch(ArithmeticException e) {
        	System.out.println("AE is comingg......");
        	e.printStackTrace();
        }
        catch(NullPointerException e) {
        	System.out.println("NE is comingg......");
        	e.printStackTrace();
        }
		
		System.out.println("Bye");		
		System.out.println("Bye");
		System.out.println("Bye");



}
}