package cn.z2huo.knowledge.basic.accessPerm.pack;

class People {
	People() {
		System.out.println("this is a person");
	}
	void run() {
		System.out.println("人是通过两条腿走路的");
	}
	public static void main(String[] args) {
//		Dog dog = new Dog();	// 不能访问，两个不在同一个包中，即使是在当前包的子包内
	}
}
