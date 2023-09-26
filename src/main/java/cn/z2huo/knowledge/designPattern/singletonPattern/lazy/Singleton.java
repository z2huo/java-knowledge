package cn.z2huo.knowledge.designPattern.singletonPattern.lazy;

/*
 * 懒汉式，线程不安全，最基本的实现方式，不支持多线程。
 * 在第一次调用时才初始化，避免内存浪费。
 */

public class Singleton {
	private static Singleton singleton;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public void show() {
		System.out.println("hello world!");
	}
}
