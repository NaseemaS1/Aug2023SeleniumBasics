package seleniumBasics;

public class Employee2 {
	int empid;
	String empname;
	int salary;
	int deptno;
	
	void setdata(int id,String name,int sal,int dno)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
		
	}
	
	        public static void main(String[] args)
	        {
	        	Employee2 emp=new Employee2();
	        	emp.setdata(101,"RAJ",20000,10);
	        	emp.display();
	        	
	        	Employee2 ep=new Employee2();
	        	ep.setdata(102,"kiran",30000,20);
	        	ep.display();
	        	
	        	
	        	
	        }

}
