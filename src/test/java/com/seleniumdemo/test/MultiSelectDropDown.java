package com.seleniumdemo.test;

import java.io.Console;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Practise\\Selenium\\newautoamtion\\seleniumdemo\\src\\main\\resources\\exefiles\\chromedriver.exe");
	
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///F:/drop.html");
	    System.out.println("url launched successfully.");
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    WebElement multisel=driver.findElement(By.tagName("select"));
	    Select sel =new Select(multisel);
	    
	   
	    	List<WebElement>multiselect=sel.getOptions();
	    	for(int i=0;i<multiselect.size();i++)
	    		
	    	{
	    		String svalue=multiselect.get(i).getText();
	    		//System.out.println("Value of select item is="+svalue);
	    		if(svalue.contains("Singh"))
	    		{
	    		 sel.selectByIndex(i);
	    		 try
	    		 {
	    		 System.out.println("All selected values :"+sel.getAllSelectedOptions().get(i).getAttribute("value"));
	    		//break;
	    		 }
	    		 catch(Exception e)
	    		 {
	    			 e.printStackTrace();
	    		 }
	    		
	    		}
	    	}
	    
	    driver.close();
	    
	    
	    
	    
	
	}

}
