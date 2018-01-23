package com.testng.practise;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParallelExecution {
	static WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void setUp(String browser) {
		if (browser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\geckodriver.exe");

			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://www.store.demoqa.com");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	
	@Test
	public void login() throws InterruptedException
	{
	   
		driver.findElement(By.className("account_icon")).click();
		 
	    driver.findElement(By.id("log")).sendKeys("testuser_1");
	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	 
	   // driver.findElement(By.name("submit")).click();
	    //Thread.sleep(3000);
		/*	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		

		driver.findElement(By.id("log")).sendKeys("testuser_1");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();*/
	}

	
}
