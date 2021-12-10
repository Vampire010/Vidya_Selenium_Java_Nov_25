package Alerts_Ex;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt_ex {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.navigate().to("file:///C:/Users/91973/git/Vidya_Selenium_Java_Nov_25/Vidya_Selenium_Java_Nov_25/src/main/java/Html/prompt_popup.html");

		
		
		d.findElement(By.xpath("/html/body/button")).click();

		//Wait for the alert to be displayed and store it in a variable
		Alert alert = d.switchTo().alert();

		//Store the alert text in a variable
		String text = alert.getText();
		System.out.print(text);
		alert.sendKeys("A");
		Thread.sleep(3000);
		//Press the OK button
		//alert.accept();
		alert.dismiss();
	}

}
