package cn.z2huo.knowledge.basic.internalClass.anonymousInternalClass;

import cn.z2huo.knowledge.basic.internalClass.internalAndTransUp.Destination;

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
