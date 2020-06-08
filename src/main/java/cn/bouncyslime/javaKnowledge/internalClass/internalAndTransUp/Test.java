package cn.bouncyslime.javaKnowledge.internalClass.internalAndTransUp;

public class Test {
	public static void main(String[] args) {
		Demo demo = new Demo();
		Contents contents = demo.getContents();
		Destination destination = demo.getDestination("hhhh");
		// Demo.MyContents 是 private的，所以除了Demo，没有人能够访问它。
//		Demo.MyContents contents3 = demo.new MyContents();
	}
}
