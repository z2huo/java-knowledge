package cn.bouncyslime.javaKnowledge.extend;

class Person {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("这是 person 类");
		say();
	}
	
	public void say() {
		System.out.println("我叫 "+name);
	}
	
}
