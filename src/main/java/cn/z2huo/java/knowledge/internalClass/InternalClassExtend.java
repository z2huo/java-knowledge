package cn.z2huo.java.knowledge.internalClass;

// �ڲ���ļ̳У�

public class InternalClassExtend {
	class Egg{
		private Yolk y;
		class Yolk{
			public Yolk() {
				System.out.println("Egg.Yolk()");
			}
		}
		public Egg() {
			System.out.println("new Egg");
			y = new Yolk();
		}
	}
	
	class BigEgg extends Egg{
		private Yolk y;
		class Yolk{
			public Yolk() {
				System.out.println("BigEgg.Yolk()");
			}
		}
		public BigEgg() {
			System.out.println("new BigEgg");
			y = new Yolk();
		}
	}
	
	public static void main(String[] args) {
		InternalClassExtend internalClassExtend = new InternalClassExtend();
		internalClassExtend.new BigEgg();
	}
	
}
