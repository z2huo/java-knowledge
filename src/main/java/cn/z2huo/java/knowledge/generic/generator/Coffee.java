package cn.z2huo.java.knowledge.generic.generator;

public class Coffee {
	private static long counter = 0;
	private final long id = counter++;
	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
}

class Latte extends Coffee{};
class Mocha extends Coffee{};
class Cappuccino extends Coffee{};
class Americano extends Coffee{};