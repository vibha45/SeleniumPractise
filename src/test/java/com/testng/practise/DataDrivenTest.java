package com.testng.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.excel.utility.XLS_Read;

public class DataDrivenTest {
	@Test
	public void getData() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://reg.ebay.in/reg/PartialReg?_trksid=m37&rv4=1");
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       XLS_Read r=new XLS_Read("");
       
	}

}
