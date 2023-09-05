package cn.z2huo.java.knowledge.generic.generator;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
	private int count;
	public IterableFibonacci(int count) {
		this.count = count;
	}
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			public boolean hasNext() {
				return count > 0;
			}
			public Integer next() {
				count --;
				return IterableFibonacci.this.next();
			}
		};
	}
	
	public static void main(String[] args) {
		for (int i : new IterableFibonacci(18)) {
			System.out.println(i);
		}
	}
}
