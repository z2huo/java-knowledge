package cn.z2huo.knowledge.basic.abstractClass;

class DemoSon extends Demo{

	protected final String STRING = "2023.10.12";

	String name;
	
	@Override
	void run() {
		System.out.println("可以奔跑");
	}

//	void say() {
//		System.out.println("说话");
//	}
	
	public static void main(String[] args) {
		DemoSon demoSon = new DemoSon();
		demoSon.run();
		demoSon.say();
		System.out.println(demoSon.getString());
	}
}
