package com.lucky.Automation5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class amazon {
	WebDriver driver ;
@Test

public void pink() throws Exception {
	
	System.setProperty("Webdriver.edge.driver", "C:\\edge driver 116\\edgedriver_win64 (1)\\msedgedriver.exe");
	
	EdgeOptions rain = new EdgeOptions();
	
	rain.addArguments("--remote-allow-origins=*");
	
	
	 driver = new EdgeDriver();
	 driver.get("https://www.amazon.com/");
	 
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.manage().window().maximize();
	 
	 WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	 search.sendKeys("iphone 14 pro max");
	 
	WebElement m = driver.findElement(By.xpath("//input[@type='submit']"));
	m.click();
	
	WebElement n = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
	n.click();
	
	WebElement h = driver.findElement(By.id("add-to-cart-button"));
	h.click();
	
	WebElement t = driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage\"]/span/input"));
	t.click();
	
	Thread.sleep(10000);
	driver.close();
}
	
	
	
	
	
	
	
	
	
}
