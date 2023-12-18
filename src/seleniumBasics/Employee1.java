package seleniumBasics;


//Assigning values to class variables 
public class Employee1 {
	int empid;
	String empname;
	int salary;
	int deptno;
	Employee1(int id,String name,int sal,int dno)
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
          public static void main(String args[])
          {
        	  Employee1 emp1=new Employee1(101,"RAJ",85000,10);
        	  emp1.display();
        	  Employee1 emp2=new Employee1(102,"KIRAN",95000,20);
        	  emp2.display();
          }
}
