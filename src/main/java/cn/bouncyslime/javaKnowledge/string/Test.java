package cn.bouncyslime.javaKnowledge.string;

public class Test {
	public static void main(String[] args) {
		String string = "hhh";
		String string2 = "12";
		
		String string3 = string + string2;
		String string4 = "hhh12";
		String string5 = "hhh"+"12";
		System.out.println(string3 == string4);
		System.out.println(string4 == string5);
		
	}
}
