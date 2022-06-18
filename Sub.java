package sample;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sub extends Baseclass
{
	public static void main(String[] args)
	{
		launch();
		max();
		loadurl("https://www.flipkart.com/");
		String str=driver.getCurrentUrl();
		System.out.println(str);
		WebElement usernsme=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        sendkeys(usernsme, "8220879082");
        sendkeys(password, "loyalsmoker1");
        click(login);
        String str1=driver.getTitle();
		System.out.println(str1);
        System.out.println("***completed***");
        //quit();
        
            
        


	}


}
