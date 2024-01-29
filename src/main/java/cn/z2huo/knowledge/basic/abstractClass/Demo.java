package cn.z2huo.knowledge.basic.abstractClass;

abstract class Demo {

	protected final String string = "2023";

	protected String string2;

	public Demo() {

	}

	protected String getString() {
		return string;
	}

	String name;

	final void say() {
		System.out.println("可以说话");
	}

	abstract void run();

	abstract void method();
}
