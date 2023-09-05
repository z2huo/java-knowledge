package cn.z2huo.java.knowledge.bitwiseOperation;

public class AndOr {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c;
		
		if (a & b) {
			System.out.println("按位与");
		}
		if (a | b) {
			System.out.println("按位或");
		}
		
		c = (a=(1==2)) && (b=(1==1));
		System.out.println(c);
		if(c) {
			System.out.println("逻辑与 短路");
		}
		System.out.println(a);
		System.out.println(b);
		
		if ((a=(1==2)) & (b=(1==1))) {
			System.out.println("按位与 无短路");
		}
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(1^0);
		System.out.println(1^1);
		System.out.println(0^0);
		System.out.println(true^false);
		System.out.println(true^true);
		System.out.println(false^false);
	}
}
