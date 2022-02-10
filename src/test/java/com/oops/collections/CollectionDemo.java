package com.oops.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionDemo {
	
	static List myListCollection;

	public static void main(String[] args) {
		
		try {
			myListCollection  =  new ArrayList();
			//int myNumbers[] = new int[5];
			
			int myAge  = getAge();
			
			
			myListCollection.add("Kumar T");
			myListCollection.add("JNTU, HyderNagar, Hyd, 500085");
			
			myListCollection.add("M");
			
			myListCollection.add(myAge);
			
			System.out.println(myListCollection);
			
			int monthlySalary =  getSalary();
			
			myListCollection.add(monthlySalary);
			System.out.println(myListCollection);
			
			
			//List, Set, Map - Interfaces
			//ArrayList, LInkedList, HashMap  - classes
		} catch (ArithmeticException e) {
			System.out.println(myListCollection);
		}

	}

	private static int getSalary() {
		Scanner scanner  =  new Scanner(System.in);
		System.out.println("Please enter the months");
		int months  =  scanner.nextInt();
		System.out.println("Please enter the annaual salary");
		int annualSalary  =  scanner.nextInt();
		return annualSalary/months;
	}

	private static int getAge() {
		return 40;
	}

}
