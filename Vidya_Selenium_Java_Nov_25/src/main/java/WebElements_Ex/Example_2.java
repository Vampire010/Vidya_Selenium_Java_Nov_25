package WebElements_Ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		//d.get("https://www.amazon.in/");
		d.navigate().to("file:///C:/Users/91973/git/Vidya_Selenium_Java_Nov_25/Vidya_Selenium_Java_Nov_25/src/main/java/Html/enb.html");
		
		//implicit wait
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement Frst_Name = d.findElement(By.xpath("//*[@id=\"fname\"]"));
		
		boolean Frst_Name_Disp = Frst_Name.isDisplayed();
		System.out.println("Frst_Name_Disp " + Frst_Name_Disp);
		
		boolean Frst_Name_Enab = Frst_Name.isEnabled();
		System.out.println("Frst_Name_Enab " + Frst_Name_Enab);
		
		WebElement Last_Name = d.findElement(By.xpath("//*[@id=\"lname\"]"));

		boolean Last_Name_Enab = Last_Name.isEnabled();
		System.out.println("Last_Name_Enab " + Last_Name_Enab);
		
		WebElement chk_box = d.findElement(By.xpath("/html/body/form/input[4]"));


		
		/*Explicit wait for state dropdown field*/
	    WebDriverWait wait = new WebDriverWait(d, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PetName")));

		WebElement pet_name_box = d.findElement(By.xpath("//*[@id=\"PetName\"]"));
		pet_name_box.sendKeys("rocky");
		
		
		
		boolean Bef_chk_box_sel = chk_box.isSelected();
		System.out.println("Bef_chk_box_sel " + Bef_chk_box_sel);
		
		if(Bef_chk_box_sel==false)
		{
			chk_box.click();
			boolean Aft_chk_box_sel = chk_box.isSelected();
			System.out.println("Aft_chk_box_sel " + Aft_chk_box_sel);
		}
		
		else
		{
			System.out.println("Check Box is Allready Selected");
		}
		
	}

}
