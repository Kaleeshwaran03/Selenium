package Refer;


import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.id("home")).click();
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		System.out.println(driver.getCurrentUrl());
		
		List<String> list = new ArrayList<String>(all);
		
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		
	/*	
		for(String x : all) {
			if(!x.equals(parent));
			driver.switchTo().window(x);
			
			System.out.println("current window "+driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			
		}
		*/
		driver.quit();
		
		
		
		
	}
	}
