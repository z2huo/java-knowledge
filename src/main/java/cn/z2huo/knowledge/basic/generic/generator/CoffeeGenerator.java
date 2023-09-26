package cn.z2huo.knowledge.basic.generic.generator;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>{
	private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class};
	private Random random = new Random();
	private int size;
	
	public CoffeeGenerator() {
	}
	public CoffeeGenerator(int size) {
		this.size = size;
	}
	
	public Coffee next() {
		try {
			return (Coffee) types[random.nextInt(types.length)].newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	class CoffeeIterator implements Iterator<Coffee>{
		int count = size;
		public boolean hasNext() {
			return count > 0;
		}
		public Coffee next() {
			count --;
			return CoffeeGenerator.this.next();
		}
	}
	public Iterator<Coffee> iterator(){
		return new CoffeeIterator();
	}
	
	public static void main(String[] args) {
		CoffeeGenerator generator = new CoffeeGenerator();
		for (int i = 0; i < 4; i++) {
			System.out.println(generator.next());
		}
		System.out.println();
		for(Coffee coffee : new CoffeeGenerator(10)) {
			System.out.println(coffee);
		}
	}
}
