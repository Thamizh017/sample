package sample;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Basic {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String basURL="https://www.amazon.in";
		driver.
		Wait wait = new FluentWait(driver)
			    .withTimeout(Duration.ofSeconds(10))
			    .pollingEvery(Duration.ofSeconds(2))
			    .ignoring(Exception.class);
    
//		   WebElement element = wait.until(ExpectedConditions.visibilityOf(element1));
		
	
		
				
		driver.get(basURL);
		String url=driver.getCurrentUrl();
		String source=driver.getPageSource();
		String title=driver.getTitle();
		String windowhandle=driver.getWindowHandle();
		Set windows=driver.getWindowHandles();
		System.out.println("The URL is:"+url);
		//System.out.println("Page source :"+ source);
		System.out.println("Page title is :"+ title);
		System.out.println("the windowhandle is:"+ windowhandle);
		System.out.println("the handles:"+ windows);
	   // driver.close();
		driver.navigate();
		//driver.quit();
		
	}
}
