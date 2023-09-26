package cn.z2huo.knowledge.basic.annotation;

public class Testable {
	public void execute() {
		System.out.println("Executing.");
	}
	@Test void testExecute() {
		execute();
	}
}
