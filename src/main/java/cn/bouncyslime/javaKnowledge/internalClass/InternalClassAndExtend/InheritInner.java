package cn.bouncyslime.javaKnowledge.internalClass.InternalClassAndExtend;

class WithInner{
	class Inner{}
}

public class InheritInner extends WithInner.Inner{
	public InheritInner(WithInner withInner) {
		withInner.super();
	}
	public static void main(String[] args) {
		WithInner withInner = new WithInner();
		InheritInner inheritInner = new InheritInner(withInner);
	}
}
