package cn.z2huo.knowledge.basic.defaultKeywords;

public interface MyInterFace {
	public default void sayHello() {
		System.out.println("hello！ I am myInterFace");
	}
}
