package cn.z2huo.java.knowledge.arrays.dataGenerator;

import cn.z2huo.java.knowledge.generic.generator.Generator;

public class GeneratorsTest {
	public static int size = 5;
	public static void test(Class<?> surroundingClass) {
//		System.out.println(Arrays.toString(surroundingClass.getClasses()));
		for(Class<?> type : surroundingClass.getClasses()) {
			System.out.print(type.getSimpleName() + ": ");
			Generator<?> g;
			try {
				g = (Generator<?>) type.newInstance();
				for(int i=0; i<size; i++) {
					System.out.print(g.next() + " ");
				}
				System.out.println();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		test(CountingGenreator.class);
	}
}
