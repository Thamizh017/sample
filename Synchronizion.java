package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronizion {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//global wait apply for all elements
		driver.get("https://www.flipkart.com/");
//		WebDriverWait w=new WebDriverWait(driver, 10);
		WebElement username =driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	    sendKeys(driver,username,10,"8220879082");
	    sendKeys(driver,password,10,"loyalsmoker1");
	    WebElement login=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	    clickon(driver,login,3);
	}
	public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value) 
	{
		WebDriverWait w=new WebDriverWait(driver,timeout);
		w.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	
	}
	public static void clickon(WebDriver driver,WebElement element,int timeout) 
	{
		WebDriverWait w=new WebDriverWait(driver,timeout);
		w.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
 
	}

}
