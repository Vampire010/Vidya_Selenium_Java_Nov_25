package Alerts_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames_Ex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/91973/git/Vidya_Selenium_Java_Nov_25/Vidya_Selenium_Java_Nov_25/src/main/java/Html/IFrames.html");
		
		// Maximize the web browser. 
		   driver.manage().window().fullscreen();
		   
		   // Locate iframe and switch driver context to first iframe by value of name attribute. 
		   System.out.println("Switching to Frame 1 - WIKIBOOKS from main web page"); 
		  
		   //Select Frame By Frameindex
		   driver.switchTo().frame(0); 
		  
		   driver.findElement(By.id("searchInput")).sendKeys("Frame 1 - WIKIBOOKS"); 
		   //Thread.sleep(3000);
		   
		  
		   
		   driver.switchTo().defaultContent();
		   
		// Locate iframe and switch driver context to first iframe by value of name attribute. 
		   System.out.println("Switching to Frame 2 - MediaWiki from main web page"); 
		  
		   driver.switchTo().frame("Frame2"); 
		   
		   driver.findElement(By.id("searchInput")).sendKeys("Frame 2 - MediaWiki"); 
		   //Thread.sleep(3000);
		   
		   
		   driver.switchTo().defaultContent();
		   
			// Locate iframe and switch driver context to first iframe by value of name attribute. 
			   System.out.println("Switching to Frame 3 - Wikipedia from main web page"); 
			  
			   
			   WebElement fram_3 = driver.findElement(By.xpath("//*[@id=\"Frame3\"]"));
			   
			   driver.switchTo().frame(fram_3); 
			   
			   driver.findElement(By.id("searchInput")).sendKeys("Frame 3 - Wikipedia"); 
			   //Thread.sleep(3000);


	}

}
