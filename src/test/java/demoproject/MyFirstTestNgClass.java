package demoproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestNgClass {
  @Test
  public void myfirstTestCase() {
	  System.out.println("Welcome Ajay!");
		Assert.assertEquals("Kumar", "Kumar", "Both the strings are not equal");
		System.out.println("Both the strings are equal");
  }
  
  @Test
  public void mySecondTestCase() {
	  System.out.println("Welcome Ajay!");
		Assert.assertEquals("Kumar", "Ajay", "Both the strings are not equal");
		System.out.println("Both the strings are equal");
  }
}
