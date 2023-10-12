package cn.z2huo.knowledge.basic.abstractClass;

abstract class Demo {

	protected final String STRING = "2023";

	protected String getString() {
		return STRING;
	}

	String name;

	void say() {
		System.out.println("可以说话");
	}

	abstract void run();
}
