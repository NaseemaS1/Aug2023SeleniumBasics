package WebDriverArch;

public interface WebDriver {

	public void findElements(String locator);
	public void click(String locator);
	public void sendkeys(String locator,String value);
	public String getTitle();
	public void get(String url);
	public void close();
	
}
