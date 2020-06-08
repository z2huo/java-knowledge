package cn.bouncyslime.javaKnowledge.internalClass.anonymousInternalClass;

import cn.bouncyslime.javaKnowledge.internalClass.internalAndTransUp.Destination;

public class Demo {
	public Destination destination(String dest) {
		return new Destination() {
			private String labelString = dest;
			@Override
			public String readLabel() {
				return labelString;
			}
		};
	}
	
	public static void main(String[] args) {
		Destination destination = new Demo().destination("hh");
	}
}
