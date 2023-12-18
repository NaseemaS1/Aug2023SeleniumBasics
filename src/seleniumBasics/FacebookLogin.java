
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin  {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
	ChromeDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
   driver.findElement(By.partialLinkText("new account")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("David");
   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("matt");
   driver.findElement(By.xpath("//input[@id='u_1e_g_J6']")).sendKeys("david56@gmail.com");
   }

}
