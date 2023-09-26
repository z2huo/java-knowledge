package cn.z2huo.knowledge.basic.generic.other;

class Student extends Person{
	public String name;
	private int age;
	Student(String name, int age) {
		super(name, age);
	}
	
}

class Person {
	public String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
