package com.seleniumdemo.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDivDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_2");
	driver.findElement(By.id("LinkDropdownDemo")).click();
	List<WebElement>option=driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//a"));
	int size=option.size();
	System.out.println(size);
	for(int i=0;i<size;i++)
	{
		System.out.println(option.get(i).getText());
		if(option.get(i).getText().contains("CSS"))
		{
			option.get(i).click();
			break;
		}
		
	}
	}

}
