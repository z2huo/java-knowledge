package cn.z2huo.knowledge.typeInformation.nullObject;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static class NullPerson extends Person implements Null{
		private NullPerson() {
			super("None", 0);
		}
		
	}
	public static final Person NULL_PERSON = new NullPerson();
}
