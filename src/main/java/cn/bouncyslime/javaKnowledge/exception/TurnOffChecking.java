package cn.bouncyslime.javaKnowledge.exception;

import java.io.FileNotFoundException;

public class TurnOffChecking {
	
	static void throwRuntimeException() throws RuntimeException {
		throw new RuntimeException(new FileNotFoundException());
	}
	
	public static void main(String[] args) {
		try {
			throwRuntimeException();
		} catch (RuntimeException e) {
			System.out.println(e.getCause());
		}
	}
}
