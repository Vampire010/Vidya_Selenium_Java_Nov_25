package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.navigate().to("https://www.snapdeal.com/");
		WebElement Click_Prodts = d.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[5]/a/div[3]/div[1]"));
		Thread.sleep(4000);

		String Product_Name = Click_Prodts.getText();
		System.out.println(Product_Name);
		Click_Prodts.click();

		
		d.quit();
	}

}
