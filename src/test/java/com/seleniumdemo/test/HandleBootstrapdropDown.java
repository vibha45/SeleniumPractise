package com.seleniumdemo.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapdropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("menu1")).click();
		Thread.sleep(2000);
		List<WebElement>drop=driver.findElements(By.xpath("//div[@class='dropdown open']//li/a"));
		for (WebElement ele : drop) {
			
			System.out.println("values :"+ele.getAttribute("innerHTML"));
			if(ele.getAttribute("innerHTML").contains("JavaScript"))
			{
				ele.click();
				break;
			}
			
		}
		
		
	}

}
