package com.seleniumdemo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DataProviderDemo {
	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
	   WebDriver driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   
	   driver.get("http://www.freecrm.com/");
	}


	
	@AfterMethod
	public void tearDown()
	{
		
	}

}
