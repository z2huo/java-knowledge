package cn.bouncyslime.javaKnowledge.interfaces.nesting;

import cn.bouncyslime.javaKnowledge.interfaces.nesting.A.Dimp2;

class A{
	interface B{
		void f();
	}
	public class Bimp implements B{
		@Override
		public void f() {
			
		}
	}
	private class Bimp2 implements B{
		@Override
		public void f() {
		}
	}
	
	public interface C{
		void f();
	}
	class Cimp implements C{
		@Override
		public void f() {
		}
	}
	
	private interface D{
		void f();
	}
	private class Dimp implements D{
		@Override
		public void f() {
		}
	}
	public class Dimp2 implements D{
		@Override
		public void f() {
		}
	}
	
	public D getD() {
		return new Dimp2();
	}
	private D dRef;
	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E{
	interface G{
		void f();
	}
	public interface H{
		void f();
	}
//	private interface I{
//		
//	}	接口中嵌套的接口必须是public的，这与接口中的域要求一致
	void g();
}

public class Nesting {
	public class Bimp implements A.B{
		@Override
		public void f() {
		}
	}
	public class Cimp implements A.C{
		@Override
		public void f() {
		}
	}
//	class Dimp implements A.D{
//	}
	class Eimp implements E{
		@Override
		public void g() {
		}
	}
	class EGImp implements E.G{
		@Override
		public void f() {
		}
	}
	class Eimp2 implements E{
		public void g() {};
		class EG implements G{
			public void f() {};
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		A a2 = new A();
		a2.receiveD(a.getD());
		
//		A.D ad = a.getD();	//A.D是private的，不可以访问，需要改为包访问权限
		A.Dimp2 dimp2 = (A.Dimp2) a.getD();
		a.getD();	//返回的D类型
//		a.getD().f();	//调用返回的类型D的方法，private无法访问，需要改为包访问权限
	}
}
