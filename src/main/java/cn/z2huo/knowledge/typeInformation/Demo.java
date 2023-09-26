package cn.z2huo.knowledge.typeInformation;

public class Demo {
	static int[] array = new int[5];
	int[] array2;
	public static void main(String[] args) {
		int[] array3 = new int[5];
		int[] array4;
		System.out.println(array3);
//		System.out.println(array4);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}

		
	}
}
