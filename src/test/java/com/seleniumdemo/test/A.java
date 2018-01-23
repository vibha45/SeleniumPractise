package com.seleniumdemo.test;
import org.testng.annotations.Test;
public class A {
	 @Test(groups = { "A" },priority=1)
	   
	   public void testPrintMessageA() {
	      
	      System.out.println("A");
	   }

	   @Test(groups = { "A" },priority=2)
	   
	   public void testSalutationMessageC() {
	      System.out.println("C");
	   }



}
