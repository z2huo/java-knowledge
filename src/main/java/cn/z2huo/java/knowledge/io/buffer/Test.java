package cn.z2huo.java.knowledge.io.buffer;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		try(ByteArrayInputStream bais = new ByteArrayInputStream("1234567890".getBytes());
				BufferedInputStream bis = new BufferedInputStream(bais,4)){
			System.out.println((char)bis.read());
			System.out.println((char)bis.read());
			System.out.println((char)bis.read());
			bis.mark(3);
			System.out.println((char)bis.read());
			System.out.println((char)bis.read());
			bis.reset();
			int b;
			while((b=bis.read())!=-1) {
				System.out.println((char)b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
