package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConsept {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kamalesh.t555");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("fdf");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		driver.findElement(By.name("mytext4")).sendKeys("kamal");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("sdfbdsjh");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sdsd");
		driver.findElement(By.xpath("//span[contains(text(),'Clear selection')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Web Testing')]")).click();
	

		
	}

}
