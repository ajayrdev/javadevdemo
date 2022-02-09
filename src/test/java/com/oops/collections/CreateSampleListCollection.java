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

	}

}
