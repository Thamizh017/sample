package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcepts {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8220879082");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sivabalan");
		WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
		
		String val=button.getAttribute("value");
		System.out.println(val);
		button.click();
		driver.manage().window( ).minimize();
		driver.manage().window().maximize();
		System.out.println("fininsh");
		String title=driver.getTitle();
		System.out.println("title is"+title);
		//driver.navigate().to("https://amazon.com");
	}

}