package cn.bouncyslime.javaKnowledge.hashcode;

public class TestDemo {
	public static void main(String[] args) {
		Demo demo = new Demo("zyz", 12, "male");
		System.out.println(demo.hashCode());
	}
}
