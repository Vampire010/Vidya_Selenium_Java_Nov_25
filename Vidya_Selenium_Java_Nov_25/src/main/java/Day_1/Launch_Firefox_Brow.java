package Day_1;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Brow {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\geckodriver.exe");

		//WebDriver d = new ChromeDriver();
		FirefoxDriver d = new FirefoxDriver();
		
		d.get("https://www.amazon.in/");
		
	}

}
