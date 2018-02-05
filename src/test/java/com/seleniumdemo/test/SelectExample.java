package com.seleniumdemo.test;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		
		
			  
			  System.setProperty("webdriver.chrome.driver", "F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
			  
			  WebDriver driver= new ChromeDriver();
			  
			  driver.manage().window().maximize();
			  driver.get("http://www.spicejet.com/");
			  
			  Scanner s1= new Scanner(System.in);
			  
			  System.out.println("Enter the value to be selected");
			  
			  String str= s1.nextLine();
			 
			  Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			  s.selectByVisibleText(str);
			  
			  List<WebElement>eles= s.getOptions();
			 
			  for(WebElement ele: eles)
			  {
			   
			   if(!(ele.getText().equals(str)))
			   {
			    System.out.println(ele.getText());
			   }
			  }
			  
			  driver.quit();
			  
			 }

			}

