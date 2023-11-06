package com.lucky.Automation5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class class2 {
	WebDriver driver;
@Test

public void lucky() throws Exception {
	System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
	
	ChromeOptions run = new ChromeOptions();
	run.addArguments("--remote-allow-origins=*");
	
	driver = new ChromeDriver();
	
	driver.get("https://www.target.com/");
	
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.manage().window().maximize();
	
	WebElement signin =driver.findElement(By.xpath("//span[text()='Sign in']"));
	signin.click();
	
	WebElement sign = driver.findElement(By.cssSelector("#listaccountNav-signIn > a > span"));
	
	sign.click();
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("hello");
	
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("123456");
	
	WebElement signin1 = driver.findElement(By.xpath("//span[text()='Sign in']"));
	
	signin1.click();
	
	Thread.sleep(10000);
	
	driver.close();
	
	
	
	
	
}
	
	
	
	
	
	
	
	
}
