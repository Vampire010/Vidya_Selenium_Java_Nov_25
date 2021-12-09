package Dropdown_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amzn_Dropodwn {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.navigate().to("https://www.amazon.in/");

		WebElement Drop_down = d.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select"));
		
		
		Select Amzn_Drpdwn = new Select(Drop_down);
		//Amzn_Drpdwn.selectByIndex(2);
		//Amzn_Drpdwn.selectByValue("search-alias=fashion");
		
		Amzn_Drpdwn.selectByVisibleText("Amazon Pantry");
		//Amzn_Drpdwn.deselectByVisibleText("Amazon Pantry");
		
		
	}

}
