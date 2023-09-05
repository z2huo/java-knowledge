package cn.z2huo.java.knowledge.typeInformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
	private static Pattern pattern = Pattern.compile("\\w+\\.");
	public static void main(String[] args) {
		if (args.length < 1) {
			System.exit(0);
		}
		
		int lines = 0;
		try {
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] constructors = c.getConstructors();
			if (args.length == 1) {
				for (Method method : methods) {
					System.out.println(pattern.matcher(method.toGenericString()).replaceAll(""));
				}
				for (Constructor constructor : constructors) {
					System.out.println(pattern.matcher(constructor.toString()).replaceAll(""));
				}
				lines = methods.length + constructors.length;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
