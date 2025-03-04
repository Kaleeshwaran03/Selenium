package Refer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		        // Add WebDriverManager dependency in POM.xml		
		        // Setup ChromeDriver using WebDriverManager	
				
		        WebDriverManager.chromedriver().setup();
		        
		        // Another Method *** No need dependency **
		        
		        //System.setproperty("webdriver.chrome.driver, "chrome driver path");

		        // Create a new instance of the Chrome driver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to Facebook
		        driver.get("https://www.facebook.com");
		        driver.manage().window().maximize();

		        // Print the title of the page
		        System.out.println("Page title is: " + driver.getTitle());
		        
		        Thread.sleep(2000);

		        // Close the browser
		        driver.quit();
		    }
		}


	


