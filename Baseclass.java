package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass
{
	static WebDriver driver;
	public static WebDriver launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		return driver=new ChromeDriver();
	}
	public static void max()
	{
		driver.manage().window().maximize();
	}
	public static void loadurl(String url)
	{
		driver.get(url);
	}
	public static void sendkeys(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	public static String geturl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	public static void click(WebElement button) 
	{
		button.click();
	}
	public static void quit()
	{
		driver.quit();
	}
}
