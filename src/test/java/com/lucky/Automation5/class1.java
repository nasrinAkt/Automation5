package com.lucky.Automation5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class class1 {
	WebDriver driver ;
@Test
public void tom() throws Exception {
	
System.setProperty("webdriver.chrome.driver", "C:\\edge driver 116\\edgedriver_win64 (1)\\msedgedriver.exe");	
	
	EdgeOptions run = new EdgeOptions();
	run.addArguments("--remote-allow-origins=*");
	
	 driver = new EdgeDriver();
	driver.get("https://www.dell.com/");
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.manage().window().maximize();
	
	WebElement h = driver.findElement(By.id("mh-search-input"));
	h.sendKeys("laptops");
	Thread.sleep(2000);
	
	WebElement m = driver.findElement(By.xpath("//button[@class='mh-search-btn mh-search-submit']"));
	m.click();
	Thread.sleep(2000);
	
	WebElement n = driver.findElement(By.linkText("Inspiron 15 Laptop"));
	n.click();
	
	
	
	Thread.sleep(10000);
	driver.close();
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
