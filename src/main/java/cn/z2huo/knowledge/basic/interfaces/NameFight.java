package cn.z2huo.knowledge.basic.interfaces;

interface I1{
	void f();
}

interface I2{
	int f(int i);
}

interface I3{
	int f();
}

class A{
	public int f() {
		return 1;
	}
}
class B implements I1,I2{
	@Override
	public void f() {
		
	}
	@Override
	public int f(int i) {
		return 0;
	}
}
class C extends A implements I2{
	@Override
	public int f(int i) {
		return 1;
	}
}
class D extends A implements I3{
	@Override
	public int f() {
		return 2;
	}
}

//class E extends A implements I1{
//}
//interface I4 extends I1,I3{
//}

public class NameFight {

}
