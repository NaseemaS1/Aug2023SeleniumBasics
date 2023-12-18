package WebDriverArch;

public class AmazonTest {
	
	static WebDriver driver; 

	public static void main(String[] args) {

		//chromeDriver
		//ChromeDriver driver=new ChromeDriver();
		
		//firefox
		//FirefoxDriver driver=new FirefoxDriver();
		
		//edge:
		//EdgeDriver driver=new EdgeDriver();
		
		//top casting
		String browser="chrome";
		switch (browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser name.."+browser);
			break;
		}
		
		
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElements("Emailid");
		driver.findElements("password");
		driver.sendkeys("emailId", "admin@gmail.com");
		driver.sendkeys("password", "admin@123");
		driver.click("login button");
		
		driver.close();
		
	
	}

}
