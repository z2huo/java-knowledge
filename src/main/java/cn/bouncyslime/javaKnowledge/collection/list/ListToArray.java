package cn.bouncyslime.javaKnowledge.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hhhh5");
		list.add("hhhh4");
		list.add("hhhh3");
		list.add("hhhh2");
		System.out.println("原本的List: "+list+", ClassType: "+list.getClass());
		String[] strArray = list.toArray(new String[0]);
//		String[] strArray = (String[]) list.toArray();
		System.out.println("转换成数组: "+Arrays.toString(strArray)+", ClassType: "+strArray.getClass());
		List<String> arrayToList = Arrays.asList(strArray);
		System.out.println("数组再转变为List: "+arrayToList+", ClassType: "+arrayToList.getClass());
//		arrayToList.add("hhh");
		List<String> newList = new ArrayList<>(arrayToList);
		newList.add("hhh");
		System.out.println(newList);
		
		List<String[]> list2 = new ArrayList<>();
		list2.add(new String[] {"demo","demo2","demo3"});
		list2.add(new String[] {"demo","demo2","demo3"});
		list2.add(new String[] {"demo","demo2","demo3"});
		System.out.println("原本的List: "+list2+", ClassType: "+list2.getClass());
		String[][] array = list2.toArray(new String[0][0]);
		for(String[] arr : array) {
			System.out.println(Arrays.toString(arr));
		}
		list2 = Arrays.asList(array);
		System.out.println(list2);
		
		List<List<String>> list3 = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		list4.add("demo");
		list4.add("demo2");
		list3.add(list4);
		list3.add(list4);
		System.out.println(list3);
		String[][] array2 = list3.toArray(new String[0][0]);
//		List[] array3 = list3.toArray(new List[0]);
//		System.out.println(Arrays.toString(array3));
	}
}
