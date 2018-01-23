package com.seleniumdemo.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootStrepDrodowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.findElement(By.xpath("//button[contains(@class,'multiselect')] ")).click();
	
	List<WebElement>allopt=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
	for(int i=0;i<allopt.size();i++)
	{
		String dropbox=allopt.get(i).getText();
		System.out.println(dropbox);
		/*if(dropbox.contains("Oracle"))
		{
		  allopt.get(i).click();
		  break;
			
		}*/
		
	
	}
	}

}
