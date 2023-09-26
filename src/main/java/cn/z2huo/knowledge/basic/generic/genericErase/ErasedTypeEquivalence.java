package cn.z2huo.knowledge.basic.generic.genericErase;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);
		
		Class c3 = ArrayList.class;
		// 可以声明ArrayList.class，但是不能声明ArrayList<Integer>.class
//		Class c4 = ArrayList<Integer>.class;
	}
}
