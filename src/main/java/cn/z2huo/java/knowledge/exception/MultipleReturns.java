package cn.z2huo.java.knowledge.exception;

public class MultipleReturns {
	public static void f(int i) {
		System.out.println("init that requires cleanup");
		try {
			System.out.println("Point 1");
			if(i == 1)	return;
			System.out.println("Point 2");
			if(i == 2)	return;
			System.out.println("Point 3");
			if(i == 3)	return;
			System.out.println("End");
		}finally {
			System.out.println("Performing cleanup");
		}
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			f(i);
		}
	}
}
