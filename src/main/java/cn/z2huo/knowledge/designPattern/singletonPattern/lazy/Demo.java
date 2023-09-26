package cn.z2huo.knowledge.designPattern.singletonPattern.lazy;

public class Demo {
	int i = 10;
	
	public int hh() {
		return i=111;
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.hh());
	}
}
