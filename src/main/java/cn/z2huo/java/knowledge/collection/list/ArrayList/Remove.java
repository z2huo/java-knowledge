package cn.z2huo.java.knowledge.collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remove {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
//		list.add("bb");
//		list.add("aa");
//		list.add("bb");
//		list.add("c");
//		list.add("s");
//		list.add("bb");
//		list.add("c");
		System.out.println(remove(list));
	}

	public static <T> List<T> remove(List<T> list) {
		// ���ѭ��ArrayListɾ���ظ�Ԫ�صķ����ǲ����еģ���Ϊ��ɾ��������Ҫɾ��Ԫ��֮���Ԫ�ػ���ǰ���ƣ�ѭ����һ��Ԫ��ʱ��ɾ��Ԫ�ص���һ��Ԫ���Ǳ��������ġ�
//		for(int i=0; i<list.size(); i++) {
//			if (list.get(i).equals("bb")) {
//				list.remove(i);
//			}
//		}
		
		// �����Ҫ����������⣬����ʹ�õ�������ķ���
//		for(int i=list.size()-1; i>=0; i--) {
//			if (list.get(i).equals("bb")) {
//				list.remove(i);
//			}
//		}
		
//		Iterator<T> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			if (iterator.next().equals("bb")) {
//				iterator.remove();
//			}
//		}
		
		for (T t : list) {
			if("aa".equals(t)) {
				list.remove(t);
			}
		}
		
		return list;
	}
}
