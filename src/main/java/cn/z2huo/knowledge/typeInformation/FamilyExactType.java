package cn.z2huo.knowledge.typeInformation;

class Base{}
class Derived extends Base{}

public class FamilyExactType {
	static void test(Object obj) {
		System.err.println("testing obj of type " + obj.getClass());
		System.out.println("obj instanceof Base " + (obj instanceof Base));
		System.out.println("obj instanceof Derived " + (obj instanceof Derived));
		System.out.println("Base.isInstance(obj) " + Base.class.isInstance(obj));
		System.out.println("Derived.isInstance(obj) " + Derived.class.isInstance(obj));
		System.out.println("obj.getClass() == Base.class " + (obj.getClass() == Base.class));
		System.out.println("obj.getClass() == Derived.class " + (obj.getClass() == Derived.class));
		System.out.println("obj.getClass().equals(Base.class) " + obj.getClass().equals(Base.class));
		System.out.println("obj.getClass().equals(Derived.class) " + obj.getClass().equals(Derived.class));
	}
	
	public static void main(String[] args) {
		test(new Base());
		System.out.println();
		test(new Derived());
	}
}
