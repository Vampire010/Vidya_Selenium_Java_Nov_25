package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Name_Loc
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		//d.get("https://www.amazon.in/");
		d.navigate().to("https://www.google.co.in/");
	
		
		//By partialLinkText
		d.findElement(By.className("gLFyf gsfi")).sendKeys("SoftwareTestingExperts");
	}

}
