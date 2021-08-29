package cn.bouncyslime.javaKnowledge.extend;

class Student extends Person {
	public String name;
	public int age;
	
	
	public Student(String name, int age) {
		super(name, age);
		this.name = name;
		this.age = age;
		System.out.println("我是 Student 类");
	}
	public void say() {
		System.out.println("我叫 "+name+" 我岁数 "+age);
	}
	
	
}
