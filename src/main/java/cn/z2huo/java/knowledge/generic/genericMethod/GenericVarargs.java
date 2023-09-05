package cn.z2huo.java.knowledge.generic.genericMethod;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
	public static <T> List<T> makeList(T... args){
		List<T> resultList = new ArrayList<T>();
		for (T item : args) {
			resultList.add(item);
		}
		return resultList;
	}
	public static void main(String[] args) {
		List<String> list = makeList("A");
		System.out.println(list);
		list = makeList("A","B","C");
		System.out.println(list);
		list = makeList("abcdefghigklmnopqrstyvwxyz1234567890".split(""));
		System.out.println(list);
	}
}
