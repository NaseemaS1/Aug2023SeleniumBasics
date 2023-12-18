package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OrangeLogin {

	public static void main(String args[] ) throws InterruptedException
	{
		String value;
		
	WebDriverManager.chromedriver().setup();	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.name("txtUsername")).clear();
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			
	//driver.findElement(By.name("txtpassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	WebDriver driver1 = new FirefoxDriver();
	driver.findElement(By.name("Submit")).click();
	driver.findElement(By.linkText("/index.php/auth/requestPasswordResetCode")).click();
	}	

}
