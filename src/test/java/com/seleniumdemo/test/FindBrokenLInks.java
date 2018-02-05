package com.seleniumdemo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindBrokenLInks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
       ChromeOptions opt=new ChromeOptions();
       opt.addArguments("--disabled-notifications--");
       
	   WebDriver driver=new ChromeDriver(opt);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   driver.get("https://www.makemytrip.com/");
	   List<WebElement>alllinks=driver.findElements(By.tagName("//a"));
	   alllinks.addAll(driver.findElements(By.tagName("//img")));
	   
	   System.out.println("Size of full links and images :"+alllinks.size());
	   List<WebElement>activlinks=new ArrayList<WebElement>();
	   
	   for(int i=0;i<alllinks.size();i++)
	   {
		   if(alllinks.get(i).getAttribute("href")!=null)
		   {
			   activlinks.add(alllinks.get(i));
		   }
	   }
	}

}
