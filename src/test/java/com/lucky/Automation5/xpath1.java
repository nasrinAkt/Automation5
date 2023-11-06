package com.lucky.Automation5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class xpath1 {
	WebDriver driver;
@Test
public void happy() throws Exception {
	
	System.setProperty("Webdriver.cgrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
	
	ChromeOptions fun = new ChromeOptions ();
	fun.addArguments("--remote-allow-origins=*");
	
	 driver = new ChromeDriver();
	 driver.get("https://demoblaze.com/index.html");
	 
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.manage().window().maximize();
	 
	 WebElement login = driver.findElement(By.id("login2"));
	 
	 login.click();
	 
	 WebElement username = driver.findElement(By.id("loginusername"));
	 username.sendKeys("nasrin");
	 
	 WebElement password = driver.findElement(By.id("loginpassword"));
	 password.sendKeys("42345");
	 
	 WebElement login1= driver.findElement(By.xpath("//button[text()='Log in']"));
	 login1.click();
	 
	 Thread.sleep(5000);
	 
	driver.close();
	
	
	
	
	
	
	
}
		
	
	
	
}
