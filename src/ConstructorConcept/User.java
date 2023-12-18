package ConstructorConcept;

public class User {

	
	String name;
	String email;
	int userid;
	String dob;
	String city;
	
	
	//create the users on the basis of following options
	//1.name
	//2.name,emailid
	//3.name,emailid,userid
	//4.name,emailid,dob
	//5.name,email,userid,dob,city
	
	public User(String name) {
		
		this.name = name;
	}


	public User(String name, String email) {
		
		this.name = name;
		this.email = email;
	}


	public User(String name, String email, int userid) {
		
		this.name = name;
		this.email = email;
		this.userid = userid;
	}


	public User(String name, String email, String dob) {
		
		this.name = name;
		this.email = email;
		this.dob = dob;
	}


	public User(String name, String email, int userid, String dob, String city) {
		
		this.name = name;
		this.email = email;
		this.userid = userid;
		this.dob = dob;
		this.city = city;
	}


	public User(String name, int userid) {
		
		this.name = name;
		this.userid = userid;
	}
	
	public String[] getUserDetails(String name) {
		if(name.equals("Avinash")) {
		String OrderDetails[]= {"Laptop","Mouse","USB cable"};
		return OrderDetails;
		}
		else if(name.equals("Ekanth")) {
			String OrderDetails[]= {"Laptop","Mouse"};
			return OrderDetails;
			
		}
		
		else {
			return null;
		}
	}
	
}
