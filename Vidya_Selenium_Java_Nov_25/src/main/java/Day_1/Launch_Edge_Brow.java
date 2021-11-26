package Day_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge_Brow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\msedgedriver.exe");

		//WebDriver d = new EdgeDriver();
		EdgeDriver d = new EdgeDriver();
	}

}
