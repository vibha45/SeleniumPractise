package com.seleniumdemo.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleautoSuggest {
	
	static WebDriver driver;

	@Test
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.co.in/");
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 handleAutoSuggestion("testing");
	 
	}
	
	
	public void handleAutoSuggestion(String autotext)
	{
		WebElement wb=driver.findElement(By.id("lst-ib"));
				wb.sendKeys(autotext);
		//List<WebElement>autobox=driver.findElements(By.className("gsfi"));
		
		
		
	}

}
