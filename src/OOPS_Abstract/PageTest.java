package OOPS_Abstract;

public class PageTest {

	public static void main(String[] args) {

		Login_page lp=new Login_page(10);
		lp.url();
		lp.title();
		lp.pageLoadTime();
		lp.doLogin("admin", "admin123");
		lp.logo();
		
		//top casting:child class object can be reffered by parent abst class ref class variable
		
	     Page p = new Login_page();
	     p.url();
	     p.logo();
	     p.title();
	     p.pageLoadTime();
		
	}

}
