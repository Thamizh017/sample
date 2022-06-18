package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8220879082");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("loyalsmoker1");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Electronics']")).click();
		System.out.println("***************");
		WebElement wb=driver.findElement(By.xpath("//div[text()='Kamalesh']"));
		Actions action=new Actions(driver);
		action.moveToElement(wb).perform();
		System.out.println("fsdfdsfdf");
		
		driver.findElement(By.xpath("//div[text()='Orders']")).click();
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("lenovo");
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement ot=driver.findElement(By.xpath("//span[@class='_2I9KP_' and text()='Electronics']"));
		action.moveToElement(ot).build().perform();
		 driver.findElement(By.xpath("//a[@title='Mobiles']")).click();
		 System.out.println("$$$$$$$$$$$$$$$$$$");

	}

}
