package com.seleniumdemo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"F:\\Practise\\Selenium\\seleniumdemo\\src\\main\\resources\\exefiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mvnrepository.com/");
		System.out.println("welcome to mvn world!!");
	}

}
