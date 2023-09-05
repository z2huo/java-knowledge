package cn.z2huo.java.knowledge.cycleAndBranch;

public class Test {
	public static void main(String[] args) {
		String string = "hhh";
		switch (string) {
			case "hhhh":
				System.out.println("输出的是 hhhh");
				break;
			case "hhh":
				System.out.println("输出的是 hhh");
				break;
			default:
				System.out.println("默认的就是这个");
				break;
		}
	}
}
