package Refer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LocatorsIdName {
			
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();		
			WebDriver dri = new ChromeDriver();
			
			dri.get("https://www.facebook.com/login/");
			dri.manage().window().maximize();
			
			WebElement user = dri.findElement(By.id("email"));
			user.sendKeys("Kaleesh");
			
			Thread.sleep(3000);
			
			WebElement pass = dri.findElement(By.name("pass"));
			pass.sendKeys("4566885");
			
			System.out.println("website title: " + dri.getTitle());
		}

	}
	


