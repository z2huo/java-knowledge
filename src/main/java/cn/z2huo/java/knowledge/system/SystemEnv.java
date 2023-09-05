package cn.z2huo.java.knowledge.system;

import java.util.Map;

public class SystemEnv {
	public static void main(String[] args) {
		Map<String, String> map = System.getenv();
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
	}
}
