package cn.z2huo.java.knowledge.collection.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingGroups {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,12,12,13);
		System.out.println(list);
//		list.add(15);
//		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(3);
		list2.add(4);
		System.out.println(list2);
	}
}
