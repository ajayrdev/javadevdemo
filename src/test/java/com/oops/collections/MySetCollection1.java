package com.oops.collections;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class MySetCollection1 {
  @Test
  public void myTest() {
	  
	  // Set will store objects dynamically
	  // Set will not follow insertion order
	  // Set will never allow duplicates
	  
	  Set productList =  new HashSet();
	  
	  productList.add("pen");
	  productList.add("Pencil");
	  productList.add("Book");
	  productList.add("paper");
	  productList.add("Phone");
	  productList.add("Laptop");
	  productList.add("Tab");
	  productList.add("Pencil");
	  productList.add("Phone");
	  productList.add("Tab");
	  
	  
	  
	  System.out.println(productList);
  }
}
