package com.xpath.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       //method to open page url
       driver.get("http://pages.half.ebay.com/help/seller/textbook_sell.html");
       //for links:custome xpath
     driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
	}
}
