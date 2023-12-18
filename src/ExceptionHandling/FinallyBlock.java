package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");

		try {
			int i=9/0;
			System.out.println("Hello");
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
		}
		finally {
			System.out.println("Finally Block");
		}
	}

}

   //use cases of finally block
   //DB connection wirh JAVA:

   //make the connection with DB--pass
   //hit the SQL query----pass

   //try {
   //fetch the data from the table--Exception
    //}
   //catch{}


   //close the connecton with DB