package cn.z2huo.java.knowledge.annotation;

public class Testable {
	public void execute() {
		System.out.println("Executing.");
	}
	@Test void testExecute() {
		execute();
	}
}
