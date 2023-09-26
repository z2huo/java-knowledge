package cn.z2huo.knowledge.basic.collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList("aa", "bb", "bb", "aa", "bb", "c", "s", "bb", "c")
		);
		System.out.println(remove(list));
	}

	public static List<String> remove(List<String> list) {

		// 正序遍历删除
//		for(int i = 0; i < list.size(); i++) {
//			if (list.get(i).equals("bb")) {
//				list.remove(i);
//			}
//		}

		// 倒序遍历删除
//		for(int i=list.size()-1; i>=0; i--) {
//			if (list.get(i).equals("bb")) {
//				list.remove(i);
//			}
//		}

		// 迭代器遍历删除
//		Iterator<T> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			if (iterator.next().equals("bb")) {
//				iterator.remove();
//			}
//		}

		// 迭代器报错
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals("bb")) {
				iterator.remove();
				list.add("exception");
			}
		}

		// 迭代器 报错
//		for (String t : list) {
//			if("aa".equals(t)) {
//				list.remove(t);
//			}
//		}
		
		return list;
	}
}
