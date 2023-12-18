package ExceptionHandling;

import org.openqa.selenium.chrome.ChromeDriver;

public class LuanchBrowser {
	public static void main(String[] args) {


	String browser="opera";
	switch (browser) {
	case "chrome":
		System.out.println("Chrome is luanched");
		break;
	case "firefox":
		System.out.println("ff is luanched");
		break;
	case "edge":
		System.out.println("edge is luanched");
		break;

	default:
		System.out.println("Please pass the right browser name.."+browser);
		throw new AppException("Invalid browser exception	");
		
	}
     System.out.println("enter the url");
	System.out.println("click on signup button");

	
		
}
}