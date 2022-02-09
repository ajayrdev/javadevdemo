package com.oops.collections;

import java.util.ArrayList;
import java.util.List;

public class CreateSampleListCollection {

	public static void main(String[] args) {
		List stdIdList = new ArrayList();

		stdIdList.add(101);
		stdIdList.add(102);
		stdIdList.add(103);
		stdIdList.add(104);
		stdIdList.add(105);
		stdIdList.add(106);

		System.out.println(stdIdList);
		List stdIdList1 = new ArrayList();

		stdIdList1.add(107);
		stdIdList1.add(109);
		stdIdList1.add(110);
		stdIdList1.add(111);
		stdIdList1.add(113);
		stdIdList1.add(115);
		System.out.println(stdIdList1);

		stdIdList.addAll(stdIdList1);
		System.out.println(stdIdList);

		System.out.println(stdIdList1.get(0));
		System.out.println(stdIdList1.get(1));
		System.out.println(stdIdList1.get(2));

		System.out.println(stdIdList1.equals(stdIdList1));
		System.out.println(stdIdList1.equals(stdIdList));

		System.out.println(stdIdList1.contains(101));
		System.out.println(stdIdList1.contains(107));

		System.out.println(stdIdList1.indexOf(109));
		System.out.println(stdIdList1.indexOf(113));

		System.out.println(stdIdList1.isEmpty());
		System.out.println(stdIdList1.size());
		System.out.println(stdIdList.size());

		System.out.println(stdIdList1.remove(0));
		System.out.println(stdIdList1);
		System.out.println(stdIdList);

	}

}
