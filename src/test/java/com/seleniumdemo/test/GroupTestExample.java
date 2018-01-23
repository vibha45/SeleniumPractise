package com.seleniumdemo.test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestExample {
	
	@Test(groups = { "B" },priority=1)
	   
	   public void testPrintMessageB() {
	      
	      System.out.println("B");
	   }

	   @Test(groups = { "B" },priority=2)
	   
	   public void testSalutationMessageD() {
	      System.out.println("D");
	   }


}
