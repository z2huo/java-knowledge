package cn.bouncyslime.javaKnowledge.method.overload;

public class Demo {
	public static void main(String[] args) {
		
	}
	
	/*
	 * public void process(String id, String name) {
	 * 
	 * }
	 * 
	 * public void process(String name, String id) {
	 * 
	 * }
	 */
	
	public void hhh(int age, String name) {
		
	}
	
	public void hhh(String name, int age) {
		
	}
	
	public void resolve(String id, String name, int age) {
		System.out.println(id+" "+name+" "+age);
	}
	public void resolve(int age, String name, String id) {
		System.out.println(id+" "+name);
	}
}
