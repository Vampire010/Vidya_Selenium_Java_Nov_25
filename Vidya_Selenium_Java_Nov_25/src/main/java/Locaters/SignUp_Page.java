package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp_Page 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		//d.get("https://www.amazon.in/");
		d.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		
		//d.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		
		//By partialLinkText
		d.findElement(By.linkText("Register")).click();
		
		
		//Get the Title of the Page
		System.out.print(d.getTitle());
		
		
		
		//By linkText
		d.findElement(By.partialLinkText("Regi")).click();
		
		//By id
		d.findElement(By.id("customer.firstName")).sendKeys("Radha");
		d.findElement(By.id("customer.lastName")).sendKeys("Krishna");
		d.findElement(By.id("customer.address.street")).sendKeys("Krishna Road , Temple Street");
		
		//By name
		d.findElement(By.name("customer.address.city")).sendKeys("Krishna nagar");
		d.findElement(By.name("customer.address.state")).sendKeys("Andra");
		
		
		//By CssSelector
		d.findElement(By.cssSelector("#customer\\.address\\.zipCode")).sendKeys("560025");
		d.findElement(By.cssSelector("#customer\\.phoneNumber")).sendKeys("1234567890");
		
		//By Xpath
		d.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("Krishna nagar");
		
		d.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[10]/td[2]/input")).sendKeys("Krishna_008");
		d.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[11]/td[2]/input")).sendKeys("Krishna@007");
		d.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[12]/td[2]/input")).sendKeys("Krishna@007");
		
		
	//	d.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).click();
		
		d.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).submit();

		
		
		
	}

}
