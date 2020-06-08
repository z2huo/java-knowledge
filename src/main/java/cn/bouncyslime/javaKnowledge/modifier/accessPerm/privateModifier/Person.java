package cn.bouncyslime.javaKnowledge.modifier.accessPerm.privateModifier;

public class Person {
	public Person() {
	}
	public void sport() {
		System.out.print("人");
		run();
		System.out.print("，还");
		jump();
	}
	private void run() {
		System.out.print("可以跑");
	}
	private void jump() {
		System.out.print("可以说话");
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.jump();
		person.run();
		System.out.println();
		person.sport();
	}
}
