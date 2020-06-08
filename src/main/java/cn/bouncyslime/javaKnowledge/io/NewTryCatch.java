package cn.bouncyslime.javaKnowledge.io;

import java.io.FileWriter;
import java.io.IOException;

public class NewTryCatch {
	public static void main(String[] args) {
		String str = "hello world";
		try(FileWriter fw = new FileWriter("demo")){
			fw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
