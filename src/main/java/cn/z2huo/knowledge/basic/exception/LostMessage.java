package cn.z2huo.knowledge.basic.exception;

class VeryImportantException extends Exception{
	@Override
	public String toString() {
		return "a very important exception";
	}
}

class HoHumException extends Exception{
	@Override
	public String toString() {
		return "a trivial exception";
	}
}

public class LostMessage {
	void f() throws VeryImportantException {
//		throw new VeryImportantException();
	}
	
	void dispose() throws HoHumException {
		throw new HoHumException();
	}
	
	static String returnInTryCatch() {
		try {
			new LostMessage().f();
			return "try"+" block";	// 出现异常会中断程序，所以这一句是运行不了的。
		} catch (VeryImportantException e) {
			return "catch";
		} finally {
			System.out.println("finally");
		}
	}
	
	public static void main(String[] args) {
//		try {
//			LostMessage lostMessage = new LostMessage();
//			try {
//				lostMessage.f();
//			}finally {
//				lostMessage.dispose();
//			}
//		}catch (Exception e) {
//			System.out.println(e);
//		}
		
//		LostMessage lostMessage = new LostMessage();
//		try {
//			lostMessage.f();
//		} catch (VeryImportantException e) {
//			e.printStackTrace();
//		}finally {
//			return;
//		}
		
//		try {
//			throw new VeryImportantException();
//		} finally {
//			return;
//		}
		
		System.out.println(returnInTryCatch());
	}
}
