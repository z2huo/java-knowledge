package cn.z2huo.java.knowledge.arrays;

import java.util.Arrays;

public class InitArray {
	public static void main(String[] args) {
		int[] array = new int[5];
		String[] array2 = new String[5];
		double[] array3 = new double[5];
		char[] array4 = new char[5];
		boolean[] array5 = new boolean[5];
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		System.out.println(Arrays.toString(array5));
		
		int[][] a = {
		        {1, 2, 3},
		        {4, 5, 6}
		    };
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.deepToString(a));
		
	}
}
