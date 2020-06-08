package cn.bouncyslime.javaKnowledge.defaultKeywords;

public interface MyInterFace {
	public default void sayHello() {
		System.out.println("hello！ I am myInterFace");
	}
}
