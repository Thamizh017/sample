package sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AnnotauionDemo 
{
	static WebDriver driver;
	@BeforeClass
	public static void launchu()
	{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("****Bowser luanched****");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String str=driver.getTitle();
		System.out.println(str);
	}
	@Before
	public void date()
	{
		Date d=new Date();
		System.out.println(d);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void check1() throws InterruptedException
	
	{
		System.out.println("****1st test started****");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8220879082");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("loyalsmoker1");;
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		String str="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertTrue(driver.getTitle().equals(str));
		Thread.sleep(4000);
		System.out.println("****1st test completed****");
	}
	@Test
	public void check2()
	{
		launchu();
		System.out.println("****2nd test started****");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("loyalsmokero");;
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();	
		System.out.println("****2nd test completed****");
	}
	@Test
	public void check3()
	{
		launchu();
		System.out.println("****3rd test started****");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8220879082");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("loyalsmokero");;
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();		
		System.out.println("****3rd test completed****");

	}
	@After
	public void date1()
	{
		Date d=new Date();
		System.out.println(d);
	}
	@AfterClass
	public static void close()
	{
		driver.quit();
		System.out.println("****Bowser closed****");

	}




}
