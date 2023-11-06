package com.lucky.Automation5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class xpath {
	WebDriver driver;
@Test
public void good() throws Exception {
	
System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");	
	
	ChromeOptions chromee = new ChromeOptions();
	chromee.addArguments("--remote-allow-origins=*");
	
	 driver = new ChromeDriver();
	driver.get("https://www.bankofamerica.com/");
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.manage().window().maximize();
	
	WebElement tom = driver.findElement(By.xpath("//a[@id='forgot-oid-pwd']"));
	
	tom.click();
	
	WebElement tom1 = driver.findElement(By.xpath("//input[@name='acctNumberField']"));
	tom1.sendKeys("hello");
	
	WebElement tom2 =driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
	tom2.click();
	
	
	
	Thread.sleep(5000);
    driver.quit();
	
}
	
	
	
	
	
	
}
