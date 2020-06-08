package cn.bouncyslime.javaKnowledge.polymorphism.demo2;

class Super{
	private int field = 0;
	public int getField() {
		return field;
	}
}

class Sub extends Super{
	private int field = 1;
	public int getField() {
		return field;
	}
	public int getSuperField() {
		return super.getField();
	}
}

public class FieldAccess2 {
	public static void main(String[] args) {
		Super super1 = new Sub();
		System.out.println(super1.getField());
		
		Sub sub = new Sub();
		System.out.println(sub.getField()+" "+sub.getSuperField());
		
	}
}
