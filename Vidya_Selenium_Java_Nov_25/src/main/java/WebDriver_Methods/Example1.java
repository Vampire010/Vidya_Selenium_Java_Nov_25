package WebDriver_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");

		//WebDriver d = new ChromeDriver();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("CCTV");
		d.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		List<WebElement> lnk = d.findElements(By.tagName("a"));
		
		for( WebElement Allnks : lnk )
		{
			String GetAlllinks =  Allnks.getAttribute("href");
			System.out.println(GetAlllinks);		
		}		
	}

}
