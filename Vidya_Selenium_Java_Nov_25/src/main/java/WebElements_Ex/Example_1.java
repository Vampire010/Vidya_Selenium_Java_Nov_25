package WebElements_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		//d.get("https://www.amazon.in/");
		d.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		
		WebElement font_Det = d.findElement(By.xpath("//*[@id=\"leftPanel\"]/h2"));
		
		String Font_clolr = font_Det.getCssValue("color");
		System.out.println("Font_clolr " + Font_clolr);
		
		String Font_sze = font_Det.getCssValue("font-size");
		System.out.println("font-size " + Font_sze);
		
		String Font_type = font_Det.getCssValue("font");
		System.out.println("font " + Font_type);
		
		Point Text_Loc = font_Det.getLocation();
		System.out.println("Text_Loc " + Text_Loc);
		
		WebElement INP_TXTBX = d.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
		Dimension Text_inpbx = INP_TXTBX.getSize();
		System.out.println("Text_inpbx " + Text_inpbx);
		
		String Tag_Name = INP_TXTBX.getTagName();
		System.out.println("Tag_Name " + Tag_Name);
		
	}

}
