package cn.bouncyslime.javaKnowledge.generic.other;

class Student extends Person{
	public String name;
	private int age;
	public Student(String name, int age) {
		super(name, age);
	}
	
}

public class Person {
	public String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
