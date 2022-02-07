package com.oops.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List myListCollection  =  new ArrayList();
		//int myNumbers[] = new int[5];
		
		myListCollection.add("Kumar T");
		myListCollection.add("JNTU, HyderNagar, Hyd, 500085");
		myListCollection.add("M");
		myListCollection.add(33);
		myListCollection.add(false);
		
		System.out.println(myListCollection);
		//List, Set, Map - Interfaces
		//ArrayList, LInkedList, HashMap  - classes

	}

}
