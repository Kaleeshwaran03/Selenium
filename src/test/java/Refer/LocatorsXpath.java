package Refer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LocatorsXpath {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		 //tagname[@attributeName = 'attribute Value']
		
		 //tagname[contains(attributeName (); 'attribute Value')]
		
		WebElement value = driver.findElement(By.xpath ("//input[@type='text']"));
		value.sendKeys("Kaleesh");
		
	}

}




