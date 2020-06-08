package cn.bouncyslime.javaKnowledge.annotation;

public class Testable {
	public void execute() {
		System.out.println("Executing.");
	}
	@Test void testExecute() {
		execute();
	}
}
