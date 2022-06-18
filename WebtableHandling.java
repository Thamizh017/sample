package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandling 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//table[@id='customers']/tbody/tr[2]/td[1]		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowcount=rows.size();
		System.out.println("the number of rows in table:" + rowcount);
		String beforexpath="//table[@id='customers']/tbody/tr[";
		String afterxpath="]/td[1]";
		for(int i=2;i<=rowcount;i++) 
		{
			String actualXpath=beforexpath+i+afterxpath;
			WebElement value=driver.findElement(By.xpath(actualXpath));
			System.out.println(value.getText());

		}
		System.out.println("******2nd row data's*******");
		//table[@id='customers']/tbody/tr[2]/td[2]
		String afterxpathcontact="]/td[2]";
		for(int j=2;j<=rowcount;j++)
		{
			String actualxpath=beforexpath+j+afterxpathcontact;
			WebElement value=driver.findElement(By.xpath(actualxpath));
			System.out.println(value.getText());
			System.out.println("*****3rd row data's*****");	
			//table[@id='customers']/tbody/tr[2]/td[3]
			String afterxpathcountry="]/td[3]";
			for(int x=2;x<=rowcount;x++)
			{
				String actualxpath1=beforexpath+x+afterxpathcountry;
				WebElement value1=driver.findElement(By.xpath(actualxpath1));
				System.out.println(value1.getText());
			}
			//table[@id='customers']/tbody/tr[7]/td[3]        
// 			int colcount=cols.size();
//			System.out.println("the numbe of colums are:"+colcount);
//			String colbeforexpath="//table[@id='customers']/tbody/tr[1]/th[";
//			String colafterxpath="]";
//			for(int k=1;k<=colcount;k++)
//			{
//				String actualxpath1=colbeforexpath+k+colafterxpath;
//				WebElement element=driver.findElement(By.xpath(actualxpath1));
//				System.out.println(element.getText());
//			}
			//driver.quit();
		}
	}
}