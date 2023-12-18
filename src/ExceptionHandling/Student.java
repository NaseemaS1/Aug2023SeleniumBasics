package ExceptionHandling;

public class Student {
	
	public int studentMarks(String studentName) {
		System.out.println("getting student marks:"+studentName);
		
		if(studentName.equals("Ravi")) {
			try {
				int i=9/0;
				return 50;
				
			}
			catch(ArithmeticException e) {
				System.out.println("AE is coming");
				return 75;
			}
			finally {
				System.out.println("FAILLL");
				return 100;
			}
			
		}
		else if(studentName.equals("Kiran")){
			return 90;
			
		}
		else if(studentName.equals("Kiran")) {
			return 80;
		}
		else {
			System.out.println("please passs the right student name..");
			throw new AppException("student not found");
		}
		
		
		
		
	}
	public static void main(String[] args) {

		Student st=new Student();
		int mk=st.studentMarks("Ravi");
		System.out.println(mk);
		
	}

}
