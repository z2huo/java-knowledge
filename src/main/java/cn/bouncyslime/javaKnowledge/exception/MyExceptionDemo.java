package cn.bouncyslime.javaKnowledge.exception;

class MyException extends Exception{
	public MyException() {
	}

	public MyException(String arg) {
		super(arg);
	}
}

public class MyExceptionDemo {
	
	
	public void f() throws MyException {
		System.out.println("throw MyException from f()");
		throw new MyException();
	}
	
	public static void main(String[] args) {
		MyExceptionDemo myExceptionDemo = new MyExceptionDemo();
		try {
			myExceptionDemo.f();
		} catch (MyException e) {
			e.printStackTrace();
		}
		try {
			myExceptionDemo.f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
	}
}
