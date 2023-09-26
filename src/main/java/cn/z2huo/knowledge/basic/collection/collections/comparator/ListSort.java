package cn.z2huo.knowledge.basic.collection.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListSort {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("12121211212");
		list.add("adff");
		list.add("11111111");
		Collections.sort(list, new Comparator<String>() {
			public int compare(String o1, String o2) {
				int a = o1.length();
				int b = o2.length();
				return b-a;
			};
		});
		System.out.println(list);
		
		Collections.sort(list, (o1,o2) -> o1.length()-o2.length());
	}
}
