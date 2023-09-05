package cn.z2huo.java.knowledge.typeInformation.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("**** proxy: "+proxy.getClass()+", method: "+method+", args: "+args);
		if (args != null) {
			for(Object arg : args) {
				System.out.println("  "+arg);
			}
		}
		return method.invoke(proxied, args);
	}
}

class SimpleDynamicProxy2 {
	public static void main(String[] args) {
		RealObject realObject = new RealObject();
		realObject.doSomething();
		realObject.somethingElse("hahahh");
		
		MyInterface proxy = (MyInterface) Proxy.newProxyInstance(
				MyInterface.class.getClassLoader(), 
				new Class[] {MyInterface.class}, 
				new DynamicProxyHandler(realObject));
		proxy.doSomething();
		proxy.somethingElse("hhhhhh");
	}
}
