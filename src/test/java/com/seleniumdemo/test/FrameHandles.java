package com.seleniumdemo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandles {
	@Test
	public void handleFrames() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/guru99home/");
	      /* JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("window.scrollBy(0,600)");
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[@title='Automation Practice Form']")).click();
		driver.switchTo().defaultContent();*/
	}

}
