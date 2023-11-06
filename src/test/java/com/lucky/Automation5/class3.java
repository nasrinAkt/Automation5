package com.lucky.Automation5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class class3 {
WebDriver driver;
@Test	
	
public void lucky() throws Exception {	
	
System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");	
	
	ChromeOptions run = new ChromeOptions();
	run.addArguments("--remote-allow-origins=*");
	
	driver = new ChromeDriver();
	
	driver.get("https://www.dell.com/en-us");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement search = driver.findElement(By.id("mh-search-input"));
	search.sendKeys("laptops");
	
	WebElement h = driver.findElement(By.xpath("//button[@class='mh-search-btn mh-search-submit']"));
	h.click();
	
	Thread.sleep(10000);
	driver.close();
	
	
	
	
	
	
}
	
	
}
