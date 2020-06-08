package cn.bouncyslime.javaKnowledge.abstractClass;

public class DemoSon extends Demo{
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
	}
}
