package com.seleniumdemo.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ibibo_Demo {
	
	static WebDriver driver;
	@Test
	public void book_flight() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.makemytrip.com/");
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	   WebElement start_date=driver.findElement(By.id("hp-widget__depart"));
			   start_date.click();
			   
			   List<WebElement>all_months=driver.findElements(By.id("js-filterOptins"));
	          int month_count=all_months.size();
	          System.out.println("No. of months :"+ month_count);
	}

}
