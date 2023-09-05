package cn.z2huo.java.knowledge.internalClass;

public class InternalClassDemo {
	class Contents{
		private int i = 1;
		public int value() {
			return i;
		}
	}
	
	public Contents contents() {
		return new Contents();
	}
	
	public static void main(String[] args) {
		InternalClassDemo demo = new InternalClassDemo();
		Contents contents = demo.contents();
		Contents contents2 = demo.new Contents();
	}
}
