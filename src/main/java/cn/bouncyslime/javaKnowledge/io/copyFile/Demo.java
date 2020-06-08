package cn.bouncyslime.javaKnowledge.io.copyFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

//import org.apache.commons.io.FileUtils;

/**
 * 复制文件的几种方式
 * @author 张一卓
 * 2019年11月29日
 */
public class Demo {
	
	// 77ms 196ms 10ms
	/**
	 * 使用FileStreams进行复制
	 * @param source
	 * @param dest
	 */
	public void copy(String source, String dest) {
		try(InputStream inputStream = new BufferedInputStream(new FileInputStream(new File(source)));
				OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File(dest)))) {
			byte[] b = new byte[2048];
			int length;
			while((length = inputStream.read(b)) > 0) {
				outputStream.write(b, 0, length);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 11ms 10ms 9ms
	/**
	 * 通过 java Nio来复制文件
	 * @param source
	 * @param dest
	 */
	public void copyNio(String source, String dest) {
		try(FileChannel input = new FileInputStream(new File(source)).getChannel();
				FileChannel output = new FileOutputStream(new File(dest)).getChannel()) {
			output.transferFrom(input, 0, input.size());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过 Apache Commons IO提供的工具类来进行文件的复制，内部实现仍然是FileChannel
	 * @param source
	 * @param dest
	 */
//	public void copyFileByCommonsIO(String source, String dest) {
//		try {
//			FileUtils.copyFile(new File(source), new File(dest));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * 使用java7所提供的Files类来进行复制
	 * @param source
	 * @param dest
	 */
	public void copyFile(String source, String dest) {
		try {
			Files.copy(new File(source).toPath(), new File(dest).toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String source = "F:\\学习资料\\download_IntelliJ-IDEA13基础教程.pdf";
		String dest = "F:\\uploadFileDir\\copyPdf.pdf";
		long start = System.currentTimeMillis();
		new Demo().copyNio(source, dest);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
	}
}
