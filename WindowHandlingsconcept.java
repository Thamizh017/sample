package sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingsconcept {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		driver.findElement(By.xpath("//div[text()='Veirdo 100 Percent Cotton Green Color Block T-Shirt']")).click();
		Set<String> Id=driver.getWindowHandles();
		 System.out.println(Id);
	       Iterator<String> it=Id.iterator();
	       while(it.hasNext())  
	       {
	    	   String child=it.next();
	    	   System.out.println(child);
	    	   if(parentid.equals(child))
	    	   {
	    		   System.out.println("not i want");
//	    		   driver.switchTo().window(child);	  
	    	   }
	    	   else
	    	   {
	    		   System.out.println("i want");
         		   driver.switchTo().window(child);
         		   driver.navigate().to("https://web.whatsapp.com/");   
	    	   }
	    	   
	       }
	       //driver.close();
		
	  
	   
	   
       
       
	}
	
}
