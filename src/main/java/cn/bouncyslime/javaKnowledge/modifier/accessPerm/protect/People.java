package cn.bouncyslime.javaKnowledge.modifier.accessPerm.protect;

import modifier.accessPerm.protect.pack1.Animal;

public class People extends Animal{
	public People() {
		System.out.println("这种动物是人类");
	}
	public void say() {
		System.out.println("人类有自己的语言，他们之间可以相互交流");
	}
	
	public static void main(String[] args) {
		People people = new People();
		people.run();
	}
}
