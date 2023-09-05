package cn.z2huo.java.knowledge.internalClass.thisAndNew;

import cn.z2huo.java.knowledge.internalClass.thisAndNew.DotThis.Inner;

public class DotThisTest {
	public static void main(String[] args) {
		DotThis dotThis = new DotThis();
		DotThis.Inner inner = dotThis.inner();
		inner.outer().f();
		
		Inner inner2 = dotThis.inner();
		Inner inner3 = dotThis.new Inner();
	}
}
