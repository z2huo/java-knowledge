package cn.z2huo.java.knowledge.exception;

class FourException extends Exception{
	
}

public class AlwaysFinally {
	public static void main(String[] args) {
		System.out.println("entering first try block");
		try {
			System.out.println("entering second try block");
			try {
				throw new FourException();
			} finally {
				System.out.println("finally in 2nd try block");
			}
		} catch (FourException e) {
			System.out.println("caught fourException in 1st try block");
		}finally {
			System.out.println("finally in 1st try block");
		}
	}
}
