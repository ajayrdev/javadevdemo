package com.oops.collections;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class PracticeSetCollectionStudentDetails {
	@Test
	public void myStudentDetails() {

		Set studentIdList = new HashSet();

		studentIdList.add(1001);
		studentIdList.add(1002);
		studentIdList.add(1003);
		studentIdList.add(1004);
		studentIdList.add(1005);

//	  System.out.println(studentIdList);

		Set addStudentIdList = new HashSet();
		addStudentIdList.add(1007);
		addStudentIdList.add(1008);
		addStudentIdList.add(1009);
		addStudentIdList.add(1000);

//	  System.out.println(addStudentIdList);

	  System.out.println(studentIdList.equals(addStudentIdList));

		studentIdList.addAll(addStudentIdList);
		System.out.println(studentIdList);

//	 studentIdList.forEach(stdId->System.out.println(stdId));

		studentIdList.forEach(stdId -> System.out.print(stdId + " "));

//	 System.out.println(addStudentIdList.get);
		/* not working */

//	 System.out.println(addStudentIdList.indexOf(1000));

		// *Set Collection Does not contain any index value */

		System.out.println();
		System.out.println(addStudentIdList.isEmpty());

//	 System.out.println(studentIdList);

		System.out.println(addStudentIdList.remove(1000));

		System.out.println(addStudentIdList);
		System.out.println(addStudentIdList.removeAll(addStudentIdList));
		System.out.println(addStudentIdList);

		System.out.println("Student Count : " + studentIdList.size());
	}
}
