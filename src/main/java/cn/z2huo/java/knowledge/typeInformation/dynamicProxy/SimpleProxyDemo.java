package cn.z2huo.java.knowledge.typeInformation.dynamicProxy;

interface MyInterface{
	void doSomething();
	void somethingElse(String arg);
}

class RealObject implements MyInterface{
	@Override
	public void doSomething() {
		System.out.println("doSomething");
	}
	@Override
	public void somethingElse(String arg) {
		System.out.println("somethingElse " + arg);
	}
}

class SimpleProxy implements MyInterface{
	private MyInterface proxied;
	public SimpleProxy(MyInterface myInterface) {
		proxied = myInterface;
	}
	@Override
	public void doSomething() {
		System.out.println("SimpleProxy doSomething");
		proxied.doSomething();
	}
	@Override
	public void somethingElse(String arg) {
		System.out.println("SimpleProxy somethingElse " + arg);
		proxied.somethingElse(arg);
	}
}

public class SimpleProxyDemo {
	public static void consumer(MyInterface myInterface) {
		myInterface.doSomething();
		myInterface.somethingElse("hahaha");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		System.out.println();
		consumer(new SimpleProxy(new RealObject()));
	}
}
