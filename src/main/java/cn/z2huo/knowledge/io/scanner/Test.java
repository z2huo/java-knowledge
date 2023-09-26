package cn.z2huo.knowledge.io.scanner;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.nextLine();
		System.out.print(a);
		System.out.print(b);
		sc.close();
	}
}
