package cn.z2huo.java.knowledge.typeInformation;

import java.util.Random;

class Initable{
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.random.nextInt(1000);
	static {
		System.out.println("initializing initable");
	}
}

class Initable2{
	static int staticNonFinal = 147;
	static {
		System.out.println("initializing initable2");
	}
}

class Initable3{
	static int staticNonFinal = 247;
	static {
		System.out.println("initializing initable3");
	}
}

public class ClassInitialization {
	public static Random random = new Random(47);
	public static void main(String[] args) {
		Class initable = Initable.class;
		System.out.println("after creating initable ref");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticNonFinal);
		try {
			Class initable3 = Class.forName("typeInformation.Initable3");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("after creating initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	}
}
