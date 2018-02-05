package com.seleniumdemo.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleCalander {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.id("hp-widget__depart")).click();
	String xp="//span[text()='March']/../../..//a[text()=15]";
	
	while(true)
	{
		try
		{
		driver.findElement(By.xpath(xp)).click();
		break;
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
	}
	Thread.sleep(3000);
     driver.findElement(By.id("hp-widget__paxCounter")).click();
     List<WebElement>all_passenger=driver.findElements(By.xpath("//div[@class='pull-left pax-counter-container']//ul"));
     int count=all_passenger.size();
     System.out.println("total size :"+count);
   //  driver.findElement(By.xpath("//ul[@id='js-adult_counter']//li[text()='4']")).click();

	}

}
