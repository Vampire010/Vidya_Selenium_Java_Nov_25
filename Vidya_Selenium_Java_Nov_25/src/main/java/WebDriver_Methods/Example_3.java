package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.navigate().to("https://www.snapdeal.com/");
		WebElement Search_Prodts = d.findElement(By.xpath("//*[@id=\"inputValEnter\"]"));
		Search_Prodts.sendKeys("Cooler");
		Thread.sleep(4000);
		Search_Prodts.clear();
		d.close();

		
	}

}
