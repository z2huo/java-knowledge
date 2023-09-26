package cn.z2huo.knowledge.basic.annotation.useCaseAnno;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 读取PasswordUtils类，并使用反射机制查找@UseCase标记。
 */
public class UseCaseTracker {
	public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
		for(Method method : cl.getDeclaredMethods()) {
			UseCase useCase = method.getAnnotation(UseCase.class);
			if(useCase != null) {
				System.out.println(String.format("found usecase: %d, %s", useCase.id(), useCase.description()));
				useCases.remove(new Integer(useCase.id()));
			}
		}
		for(int i: useCases) {
			System.out.println("warning: missing usecase "+i);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47,48,49,50);
		trackUseCases(useCases, PasswordUtils.class);
	}
}
