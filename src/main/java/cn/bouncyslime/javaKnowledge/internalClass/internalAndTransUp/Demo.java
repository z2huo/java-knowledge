package cn.bouncyslime.javaKnowledge.internalClass.internalAndTransUp;

import java.beans.DesignMode;

public class Demo {
	private class MyContents implements Contents{
		private int i = 12;
		@Override
		public int value() {
			return i;
		}
	}
	
	protected class MyDestination implements Destination{
		private String label;
		private MyDestination(String label) {
			this.label = label;
		}
		@Override
		public String readLabel() {
			return label;
		}
	}
	
	public Destination getDestination(String string) {
		return new MyDestination(string);
	}
	
	public Contents getContents() {
		return new MyContents();
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		Contents contents = demo.getContents();
		Destination destination = demo.getDestination("hhhh");
		// 不能得到确切的类型，因为这两个方法返回的是接口类型，不能得到具体的类型。
//		MyDestination destination2 = demo.getDestination("hahahh");
//		MyContents contents2 = demo.getContents();
		// 虽然是private的，但是对于Demo自己来说还是能够访问的
		MyContents contents3 = demo.new MyContents();
		MyDestination destination3 = demo.new MyDestination("adfadfa");
	}
}
