package seleniumTraining;

public class MethodOverloading {
	
	public int getStudentMarks(String stName) {
		System.out.println("getting marks for student:"+stName);
		int marks=-1;
		if(stName.equals("Sarika")) {
			//return 90;
			marks=90;
			}
		else if(stName.equals("rahul")) {
			//return 95;
			marks=95;
		}
		else if(stName.equals("shobra")) {
			//return 100;
			marks=100;
		}
		else if(stName.equals("naveen")) {
			//return 0;
			marks=0;
		}
		else {
			System.out.println("pls pass the right  student name:"+stName);
			//return -1;
			
		}
		return marks;
		
		
	}

	public static void main(String[] args) {
		
		MethodOverloading ml=new MethodOverloading();
		int r=ml.getStudentMarks("Sarika");
		System.out.println(r);
		if(r>=0) {
			System.out.println("print the marks sheet");
		}
		
		
		

	}

}
