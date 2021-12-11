package Alerts_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down_Up_Ex {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/91973/git/Vidya_Selenium_Java_Nov_25/Vidya_Selenium_Java_Nov_25/src/main/java/Html/IFrames.html");
		driver.manage().window().fullscreen();
		
		driver.switchTo().frame(0);
		Thread.sleep(3000); 
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		  js1.executeScript("window.scrollBy(0,500)");

			Thread.sleep(3000);
		  js1.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(3000);
		  
		  js1.executeScript("window.scrollBy(600,0)");
		  	Thread.sleep(3000);
		  
		  js1.executeScript("window.scrollBy(-600,0)");

		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("WIKIBOOKS");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("Frame2");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div/form/div/input[1]")).sendKeys("MediaWiki");
		
		
		driver.switchTo().defaultContent();
		
		WebElement Frame_3 = driver.findElement(By.xpath("/html/body/iframe[3]"));

		driver.switchTo().frame(Frame_3);
		driver.findElement(By.xpath("/html/body/div[3]/form/fieldset/div/input")).sendKeys("WikiPedia");
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,500)");

			Thread.sleep(3000);
		  js.executeScript("window.scrollBy(0,-500)");
		  
		  driver.quit();
	}

}
