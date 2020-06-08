package cn.bouncyslime.javaKnowledge.designPattern.singletonPattern.registered;

public class Registered {
	private static class RegisteredInner{
		private static final Registered INSTANCE = new Registered();
	}
	
	private Registered() {
	}
	
	public static final Registered getInstance() {
		return RegisteredInner.INSTANCE;
	}
}
