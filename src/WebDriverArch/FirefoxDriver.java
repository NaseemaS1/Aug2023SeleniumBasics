package WebDriverArch;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("luanch Firefox browser..");
	}
	@Override
	public void findElements(String locator) {

		System.out.println("finding element:" +locator);
	}

	@Override
	public void click(String locator) {

		System.out.println("Click on:"+locator);
	}

	@Override
	public void sendkeys(String locator, String value) {

         System.out.println("enter value in:"+locator+" "+"value="+value);		
	}

	@Override
	public String getTitle() {
		return "Amazon";
	}

	@Override
	public void get(String url) {

		System.out.println("Enter url" + url);
	}

	@Override
	public void close() {

		System.out.println("close the browser...");
	}


}
