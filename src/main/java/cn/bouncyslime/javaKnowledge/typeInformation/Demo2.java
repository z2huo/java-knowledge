package cn.bouncyslime.javaKnowledge.typeInformation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class arrayDemo{
	
}

public class Demo2 {
	public static void main(String[] args) {
		arrayDemo[] array = new arrayDemo[5];
		List<arrayDemo> list = new ArrayList<arrayDemo>();
//		list.add(array);
		Collections.addAll(list, array);	//该方法用来将数组中的所有元素添加到列表中年
		
	}
}
