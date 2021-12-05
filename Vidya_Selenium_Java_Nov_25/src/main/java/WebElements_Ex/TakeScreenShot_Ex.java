package WebElements_Ex;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot_Ex {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		//d.get("https://www.amazon.in/");
		d.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		
		//d.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		
		//By partialLinkText
		d.findElement(By.linkText("Register")).click();
		d.manage().window().fullscreen();
		File scrFile = d.getScreenshotAs(OutputType.FILE);
		
	    Files.copy(scrFile, new File("C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\Screenshots\\image.png"));
	    d.quit();
		
	}

}
