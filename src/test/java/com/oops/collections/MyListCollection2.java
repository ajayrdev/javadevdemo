package com.oops.collections;

import java.util.ArrayList;
import java.util.List;

public class MyListCollection2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		List empIdList = new ArrayList(); 
		/* ArrayList 10 methods, List 10 Methods.. furnitureList will call 20 methods
		ArrayList is a class which implements List internally. So We can use List methods also upon object creation for ArrayList Class
		 *List internally implements Collection interface. This means if you create object as shown above, you can use all the methods in 
		 *Collection interface, List interface and ArrayList class
		 *furnitureList will call 20 methods + 10 methods from collection interface .. 
		 *So total 30 methods will be available for furnitureList object */
		
		empIdList.add(100);
		empIdList.add(103);
		empIdList.add(105);
		empIdList.add(102);
		
		List additionalEmpIdList = new ArrayList(); 
		additionalEmpIdList.add(302);
		additionalEmpIdList.add(301);
		additionalEmpIdList.add(204);
		
		//Compare collections
		System.out.println(empIdList.equals(additionalEmpIdList));
		
		// Add the another collection from the index given
		empIdList.addAll(2, additionalEmpIdList);
		System.out.println(empIdList);
		
		//forEach() will take one by one object from the collection and using Lamda expression, it will process the request
		empIdList.forEach(abc -> System.out.print(abc+" "));
		//System.out.print() . This prints the given data in the same line and cursor will be in the same line itself
		//System.out.println(). This will print the given data but moves the cursor to new line
		
		System.out.println();
		System.out.println(additionalEmpIdList.get(0));
		
		System.out.println(additionalEmpIdList.indexOf(302));
		
		//additionalEmpIdList.clear();
		System.out.println(additionalEmpIdList.isEmpty());
		
		System.out.println("===========================");
		System.out.println(additionalEmpIdList);
		
		// Below remove method will remove the object at given index from the collection
		// And it returns the value which got removed
		System.out.println(additionalEmpIdList.remove(0));
		
		System.out.println(additionalEmpIdList);
		
		// Below method will remove an object.
		//Once Object is removed, it will return true.. 
		// if not removed it returns false
		Object obj  = 301;
		System.out.println(additionalEmpIdList.remove(obj)); 
		System.out.println(additionalEmpIdList);
		
		//RemoveAll removes the elements
		System.out.println(additionalEmpIdList.removeAll(additionalEmpIdList));
		System.out.println(additionalEmpIdList);
		
		//clear() and removeAll() both will remove the all objects in collection.
		//But clear() is faster than removeAll()
		
		int myempIDList[] =  new int[10]; // to declare an int array with size
		//int[] myempIDList =  new int[10]; // to declare an int array with size
		
		
		System.out.println("size of list: "+empIdList.size());
		
		
		//listIterator example
		
		//Exception handling
		//Logging mechanism using log4j
		//File IO.. .txt, .xlsx file
		
		
		

	}

}
