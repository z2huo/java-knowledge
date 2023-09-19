package cn.z2huo.java.knowledge.collection.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>列表和数组之间的相互转换</p>
 * <p>包括基本数据类型和对象</p>
 */
public class ListArrayConvert {

	private static final List<String> stringList =
			new ArrayList<>(Arrays.asList("list2", "list3", "list4", "list5"));

	private static final String[] stringArray = new String[] {"array2", "array3", "array4", "array5"};

	private static final List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

	private static final int[] intArray = new int[]{1, 2, 3, 4, 5};

	public static void integerList2Array() {
		System.out.println(">>> integer list to int array");
		System.out.println(integerList.get(0).getClass());

		System.out.println("to integer array");
		Integer[] integerArray = integerList.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integerArray));
		Object[] integerArray2 = integerList.toArray();
		System.out.println(Arrays.toString(integerArray2));

		System.out.println("to int array");
		int[] intArray = toPrimitiveArray(integerList.toArray(new Integer[0]));
		System.out.println(intArray);
		System.out.println(Arrays.toString(intArray));
	}

	public static void integerArray2List() {
		System.out.println(">>> int array to List");
		List list = Arrays.asList(intArray);
		System.out.println(list);
		System.out.println(intArray.getClass());
		System.out.println(list.get(0).getClass());

		// 基本数据类型的数组转换为集合时，需要先将基础数据类型转换为包装类型
		List<Object> list2 = Arrays.asList(toObjectArray(intArray));
		System.out.println(list2);
		System.out.println(list2.get(0).getClass());
	}

	public static void list2Array() {
		System.out.println(">>> string list to array");
		String[] array = stringList.toArray(new String[0]);
		System.out.println(Arrays.toString(array));
		Object[] array2 = stringList.toArray();
		System.out.println(Arrays.toString(array2));
	}

	public static void array2List() {
		System.out.println(">>> string array to list");
		List<String> list = Arrays.asList(stringArray);
		System.out.println(list);
	}

	private static int[] toPrimitiveArray(Integer[] array) {
		int length = array.length;
		if (length == 0) {
			return new int[0];
		}
		integerList.stream().mapToInt(Integer::intValue).toArray();
        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
	}

	private static Object[] toObjectArray(Object source) {
		if (source instanceof Object[]) {
			return (Object[]) source;
		}
		if (source == null) {
			return new Object[0];
		}
		if (!source.getClass().isArray()) {
			throw new IllegalArgumentException("Source is not an array: " + source);
		}
		int length = Array.getLength(source);
		if (length == 0) {
			return new Object[0];
		}
		Class<?> wrapperType = Array.get(source, 0).getClass();
		Object[] newArray = (Object[]) Array.newInstance(wrapperType, length);
		for (int i = 0; i < length; i++) {
			newArray[i] = Array.get(source, i);
		}
		return newArray;
	}

	public static void list2twoDimensionalArray() {
		System.out.println(">>> list to two dimensional array");
		List<String[]> list2 = new ArrayList<>();
		list2.add(new String[] {"demo","demo2","demo3"});
		list2.add(new String[] {"demo","demo2","demo3"});
		list2.add(new String[] {"demo","demo2","demo3"});
		String[][] array = list2.toArray(new String[0][0]);
		System.out.println(array);
		System.out.println(Arrays.deepToString(array));
	}

	public static void main(String[] args) {
		list2Array();
		array2List();
		integerList2Array();
		integerArray2List();
		list2twoDimensionalArray();
	}
}
