package cn.z2huo.java.knowledge.polymorphism;

class Super{
	public int field = 0;
	public int getField() {
		return field;
	}
}

class Sub extends Super{
	public int field = 1;
	public int getField() {
		return field;
	}
	public int getSuperField() {
		return super.field;
	}
}

public class FieldAccess {
	public static void main(String[] args) {
		Super super1 = new Sub();
		System.out.println(super1.field+" "+super1.getField());
		
		Sub sub = new Sub();
		System.out.println(sub.field+" "+sub.getField()+" "+sub.getSuperField());
		
	}
}
