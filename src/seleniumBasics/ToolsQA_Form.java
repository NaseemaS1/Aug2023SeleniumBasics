package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQA_Form {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();	
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys(("Kayane"));
		driver.findElement(By.id("lastName")).sendKeys(("Hilton"));
		driver.findElement(By.id("userEmail")).sendKeys(("kayane@123.gmail.com"));
	    driver.findElement(By.id("userNumber")).sendKeys(("4045835792"));
	    driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	    driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("test address ");
	    
	    //driver.findElement(By.id("dateOfBirthInput")).clear();
	    //driver.findElement(By.id("dateOfBirthInput")).sendKeys("10 AUG 1995");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__value-container')]")).click();
	    Thread.sleep(1000);
	    //driver.findElement(By.xpath("//div[contains(@id,'subjectsContainer')]")).sendKeys("Nasi tests");
	    
	   // driver.findElement(By.xpath("//input[@type='checkbox' and @value='3']")).click();
	    
	    js.executeScript("document.getElementById('subjectsContainer').value = 'Nasi tests subject';");  
	    	    
	    
	    Thread.sleep(5000);
	    driver.quit();
	    }
}