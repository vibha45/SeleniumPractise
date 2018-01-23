package com.seleniumdemo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://jmvtrinidad.github.io/angular2-datagrid/#/example/table");
	String before_xpath="//section/..//div/table/tbody/tr";
	String after_xpath="]/td[3]/button";
	for(int i=1;i<=8;i++){
		 String name =driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
		 System.out.println(name);
	}

	}

}
