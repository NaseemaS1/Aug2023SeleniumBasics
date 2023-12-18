package javaAssignments;

public class User1 {
	
	public int marks(int m) {
		
		System.out.println("Please enter the marks");
		if(m>=91&&m<=100) {
			System.out.println("Grade AA");
		}
		else if(m>=81&&m<=90) {
			System.out.println("Grade AB");
		}
		else if(m>=71&&m<=80) {
			System.out.println("Grade BB");
		}
		else if(m>=61&&m<=70) {
			System.out.println("Grade BC");
		}
		else if(m>=51&&m<=60) {
			System.out.println("GRADE CD");
		}
		else if(m>=41&&m<=50) {
			System.out.println("GRADE DD");
		}
		else if(m<=40) {
			System.out.println("FAIL");
		}
		return m;
	}

	public static void main(String[] args) {
		
		User1 u=new User1();
		int r=u.marks(56);
		System.out.println(r);

	}

}
