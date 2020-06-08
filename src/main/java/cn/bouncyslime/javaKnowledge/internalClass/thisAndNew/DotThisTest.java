package cn.bouncyslime.javaKnowledge.internalClass.thisAndNew;

import cn.bouncyslime.javaKnowledge.internalClass.thisAndNew.DotThis.Inner;

public class DotThisTest {
	public static void main(String[] args) {
		DotThis dotThis = new DotThis();
		DotThis.Inner inner = dotThis.inner();
		inner.outer().f();
		
		Inner inner2 = dotThis.inner();
		Inner inner3 = dotThis.new Inner();
	}
}
