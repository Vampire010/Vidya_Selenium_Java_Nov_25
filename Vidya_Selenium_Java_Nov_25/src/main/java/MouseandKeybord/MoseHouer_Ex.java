package MouseandKeybord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoseHouer_Ex {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.navigate().to("https://www.snapdeal.com/");
		
		Actions action = new Actions(d);
		WebElement All_Offers = d.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]/a/span[2]"));
		WebElement Air_Purifiers = d.findElement(By.xpath("//*[@id=\"category1Data\"]/div[1]/div/div/p[2]/a/span"));
		action.moveToElement(All_Offers).perform();
		Thread.sleep(2000);
		Air_Purifiers.click();
	}

}
