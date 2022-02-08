package com.oops.collections;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class MyListCollection1 {
	
  @Test
  public void myFirstTest() {
	  List productList =  new ArrayList(); 
	  //we cant create an object for an interface List. So we created for class ArrayList and assigned this object to List object
	  // List is collection which will store the objects dynamically
	  //List follows insertion order
	  // List allows duplicates while storing 
	  
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
	  productList.add(100);
	  
	  
	  System.out.println(productList);
	  
  }
  

  @Test
  public void mySecondtTest() {
	  
	  List products = new ArrayList();
	  products.add("Soaps");
	  products.add("Toothpastes");
	  products.add("Detergent Cakes");
	  //System.out.println(products);
	  
	  List additionalProducts =  new ArrayList();
	  additionalProducts.add("Tissues");
	  additionalProducts.add("Sanitizers");
	  additionalProducts.add("FaceWash Creams");
	  //System.out.println(additionalProducts);
	  
	  products.addAll(additionalProducts);
	  
	  additionalProducts.add("facepacks");
	  //System.out.println(products);
	  
	  products.add(1, "Shampoos"); // this stores the given object in the second position where the actual indexing starts from position 0
	  //System.out.println(products);
	  
	  //products.clear(); // removes all the collection objects
	  System.out.println(products);
	  
	  System.out.println(products.containsAll(additionalProducts));
	  
	  
  }


}
