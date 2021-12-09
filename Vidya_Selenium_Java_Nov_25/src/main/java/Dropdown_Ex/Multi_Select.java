package Dropdown_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.navigate().to("file:///C:/Users/91973/git/Vidya_Selenium_Java_Nov_25/Vidya_Selenium_Java_Nov_25/src/main/java/Html/Multi_Select_Dropdwn.html");

		
		WebElement Drop_down = d.findElement(By.xpath("/html/body/form/select"));
		
		
		Select Amzn_Drpdwn = new Select(Drop_down);
		
	
		Amzn_Drpdwn.selectByValue("Arcn Blk Bear");
		Amzn_Drpdwn.selectByIndex(2);
		Amzn_Drpdwn.selectByVisibleText("Sun Bear");
		
		Thread.sleep(3000);
		
	/*	Amzn_Drpdwn.deselectByIndex(2);
		Amzn_Drpdwn.deselectByValue("Arcn Blk Bear");
		Amzn_Drpdwn.deselectByVisibleText("Sun Bear");  */
		
		Amzn_Drpdwn.deselectAll();
		
	}

}
