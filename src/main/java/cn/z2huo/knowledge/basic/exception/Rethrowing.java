package cn.z2huo.knowledge.basic.exception;

public class Rethrowing {
	public static void f() throws Exception{
		System.out.println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}
	
	public static void g() throws Exception{
		try {
			f();
		} catch (Exception e) {
			System.out.println("inside g(), printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	
	public static void h() throws Exception{
		try {
			f();
		} catch (Exception e) {
			System.out.println("inside h(), printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception)e.fillInStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			System.out.println("main, printStackTrace()");
			e.printStackTrace(System.out);
		}
		
		System.out.println("------------");
		
		try {
			h();
		} catch (Exception e) {
			System.out.println("main, printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}
