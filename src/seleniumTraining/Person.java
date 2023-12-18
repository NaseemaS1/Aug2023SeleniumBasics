package seleniumTraining;

public class Person {

	public void test() {
		System.out.println("test method");
	}
	public void test(int a) {
		System.out.println("test method"+a);
	}
	public void test(String a) {
		System.out.println("test method"+a);
	}
	public void test(int a,int b) {
		System.out.println("test method"+a+b);
	}
	public void test(int b,String a) {
		System.out.println("test method"+a+b);
	}
	public void test(String a,int b) {
		System.out.println("test method"+a+b);
	}
	public void test(int c,float d) {
		System.out.println("test method"+c+d);
	}
	//ecommerce
	
	public void login(String un,String pwd) {
		
	}
    public void login(String un,String pwd,int otp) {
		
	}
    public void login(String un,String pwd,String ph) {
		
	}
    public void login(String emailid) {
		
	}
    
    //search
    
    public void search() {
    	
    }
    public void search(String productName) {
    	
    }
    public void search(String productName,int price) {
  	
    }
    public void dopayment(String cc,int cvv) {
    	
    }
    public void dopayment(String paypalid,String pwd) {
    	
    }
    
    //uber bookng
    
    public void booking(String carType,String stPoint,String endpoint ) {
    	
    }
    public void booking(String carType,String stPoint,String endpoint,int passengers) {
    }
    
	
	public static void main(String[] args) {
		Person p=new Person();
		p.test();
		p.test(100);


	}

}
