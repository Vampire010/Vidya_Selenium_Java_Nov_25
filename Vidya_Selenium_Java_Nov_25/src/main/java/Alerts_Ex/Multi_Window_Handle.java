package Alerts_Ex;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_Window_Handle {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91973\\git\\Vidya_Selenium_Java_Nov_25\\Vidya_Selenium_Java_Nov_25\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");

		
		String parentWinHandle = driver.getWindowHandle();
		System.out.println("Parent window handle: " + parentWinHandle);
 
		// Locate 'Click to open a new browser window!' button using xpath
        WebElement newWindowBtn = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[5]/a/div[3]/div[1]"));
 
        // Click the button to open a new window
        newWindowBtn.click();
 
 
        // Get the window handles of all open windows
 
        Set<String>winHandles = driver.getWindowHandles();
        System.out.println("Open window handle: " + winHandles);
      
        
        // Loop through all handles
        for(String handle: winHandles)
        {
            if(!handle.equals(parentWinHandle))
            {
            	
            	System.out.println("Where I am: " +  driver.getTitle());
            	
            	driver.switchTo().window(handle);
            	
            	Thread.sleep(1000);
            	System.out.println("Title of the new window: " + driver.getTitle());
            	
            	driver.findElement(By.xpath("//*[@id=\"pincode-check\"]")).sendKeys("560025");
 
 
            	Thread.sleep(1000);
            	//switch from child to parent
            	driver.switchTo().window(parentWinHandle);
            	Thread.sleep(2000);
            	//switch from parent to child
            	driver.switchTo().window(handle);
            	Thread.sleep(2000);
 
            }
        }
       
    	//driver.close();
 
        // Print the URL to the console
        	System.out.println("Parent window URL: " + driver.getCurrentUrl());
        	
        	driver.quit();

	}

}
