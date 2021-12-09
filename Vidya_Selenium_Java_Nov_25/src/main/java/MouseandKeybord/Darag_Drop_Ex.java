package MouseandKeybord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Darag_Drop_Ex {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.navigate().to("http://demo.guru99.com/test/drag_drop.html");

		
		Actions action = new Actions(d);
		WebElement Sourse_Drag = d.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement Dst_Drop = d.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		action.dragAndDrop(Sourse_Drag, Dst_Drop).perform();

	}

}
