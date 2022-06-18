package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle(); 
		System.out.println(title);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8220879082");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("loyalsmoker1");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		TakesScreenshot pic=(TakesScreenshot)driver;
		File src= pic.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Lenovo\\Desktop\\kamalesh\\java -senthil\\1.png");
		FileUtils.copyFile(src, dest);
	}

}
