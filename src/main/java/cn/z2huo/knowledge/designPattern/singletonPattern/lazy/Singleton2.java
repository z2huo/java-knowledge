package cn.z2huo.knowledge.designPattern.singletonPattern.lazy;

/*
 * 懒汉式，线程安全。
 */

public class Singleton2 {
//	private static Singleton2 singleton;
	private volatile static Singleton2 singleton;
	
	private Singleton2() {
	}
	
//	public static synchronized Singleton2 getInstance() {
//		if(singleton == null) {
//			singleton = new Singleton2();
//		}
//		return singleton;
//	}
	
//	public static Singleton2 getInstance() {
//		synchronized (Singleton2.class) {
//			if(singleton == null) {
//				singleton = new Singleton2();
//			}
//			return singleton;
//		}
//	}
	
	public static Singleton2 getInstance() {
		if(singleton == null) {
			synchronized (Singleton2.class) {
				if(singleton == null) {
					singleton = new Singleton2();
				}
				return singleton;
			}
		}
		return singleton;
	}
	
	public void show() {
		System.out.println("hello world!");
	}
}
