package com.seleniumdemo.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.testng.annotations.Test;

public class Handle_BrowserNotification {
	WebDriver driver;

	@Test(enabled=false)
	public void handlefirefoxBrowser() {

		System.setProperty("webdriver.gecko.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\geckodriver.exe");
		FirefoxOptions option = new FirefoxOptions();
		option.addPreference("dom.webnotifications.enabled", false);
		 driver = new FirefoxDriver(option);
		driver.get("https://www.makemytrip.com/");
		

	}

	@Test
	public void hanldlechromebrowsernotification()
	{
		//set the path of chrome exe 
		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();//create instance of chrome option class
		opt.addArguments("--disable-notifications");//add arguement to disable notification
		driver=new ChromeDriver(opt);//pass chrome option instance in to chromedriver constructor
		driver.get("https://www.makemytrip.com/");
	}
}
