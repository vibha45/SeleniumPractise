package com.seleniumdemo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapLoginPopUp {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.linkText("Log In")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@type='text']/../..//div[contains(@class,'Km0IJL col')]")).sendKeys("8506909276");
	}

}
