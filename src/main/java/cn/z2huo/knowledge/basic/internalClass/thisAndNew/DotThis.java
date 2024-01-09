package cn.z2huo.knowledge.basic.internalClass.thisAndNew;

class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	}
	
	class Inner{
		public DotThis outer() {
			return DotThis.this;
		}
	}
	public Inner inner(){
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis dotThis = new DotThis();
		Inner inner = dotThis.inner();
		inner.outer().f();
		
		Inner inner2 = dotThis.inner();
		Inner inner3 = dotThis.new Inner();
	}
}
