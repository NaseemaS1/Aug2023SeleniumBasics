package javaAssignments;

public class Browser {


	public static void main(String[] args) {

		Browser br = new Browser();
		boolean flag = br.luanchBrowser("FIRefox  ");
		if (flag) {
			System.out.println("enter url");
		} else {
			System.out.println("errror....no browser is there");
		}

	}
	
	public boolean luanchBrowser(String browserName) {
		System.out.println("Browser name is:" + browserName);
		browserName = browserName.trim().toLowerCase();
		boolean flag = true;
		if (browserName.equals("chrome")) {
			System.out.println("chrome is luanched");
		} else if (browserName.equals("firefox")) {
			System.out.println("firefox is luanched");
		} else if (browserName.equals("edge")) {
			System.out.println("edge is luanched");
		} else if (browserName.equals("safari")) {
			System.out.println("safari is luanched");

		} else {
			System.out.println("please enter the right browse name:" + browserName);
			flag = false;
		}

		return flag;
	}

	
}