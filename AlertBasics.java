package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBasics {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);//thats why throws exception
	    Alert alert=driver.switchTo().alert();//it w'll return alert class object
		alert.getText();
		
		System.out.println(alert.getText());
		String str=alert.getText();
		if(str.equals("Please enter a valid user name"))
		{
			System.out.println("coreect slert message");
		}
		else
		{
			System.out.println("in-correct alert message");
		}
		alert.accept();
		//alert.dismiss(); to cancel the alert
		//when the site ask you the files the control goes to the OS "like attach file import files"
		//you cant click button you have to send keys methed for the location of file
	}

}
