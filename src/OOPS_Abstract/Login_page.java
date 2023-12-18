package OOPS_Abstract;

public class Login_page extends Page {
	
	public Login_page() {
		System.out.println("Login_page const...");
	}

	

	public Login_page(int a) {
		super(a);
		System.out.println("Login_page const..." +a);
	}

	@Override
	public void title() {

		System.out.println("LP---Title");
	}

	@Override
	public void url() {

		System.out.println("LP---url");

	}

	public void pageLoadTime() {

		System.out.println("page Load time out=2secs");

	}

    public void doLogin(String un,String pwd) {
    	
    	System.out.println("Logged in user with:" + un + " " + pwd);
    }


}
