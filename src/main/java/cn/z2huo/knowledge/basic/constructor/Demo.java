package cn.z2huo.knowledge.basic.constructor;

public class Demo {
	
	public Demo() {
		System.out.println("无参构造器");
	}
	
	public Demo(int age) {
		System.out.println("有参构造器（整型）"+age);
	}
	
	public Demo(String name) {
		this();
//		this(11);	//不能在一个构造器里面调用多个其它的构造器
		System.out.println("有参构造器（字符串）"+name);
	}
	
	public static void main(String[] args) {
		
	}
	
	class Demo2{
		public Demo2() {
			System.out.println("内部类");
		}
	}
}

class Demo3{
	public Demo3() {
		System.out.println("不是public的类");
	}
}
