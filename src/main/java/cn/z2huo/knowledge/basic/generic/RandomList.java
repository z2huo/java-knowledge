package cn.z2huo.knowledge.basic.generic;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random();
	
	public void add(T item) {
		storage.add(item);
	}
	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}
	
	public void printList() {
		for (T t : storage) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		RandomList<Character> randomList = new RandomList<Character>();
		for (int i = 97; i < 97+26; i++) {
			randomList.add((char) i);
		}
		randomList.printList();
		for(int i=0; i<9; i++) {
			System.out.println(randomList.select());
		}
	}
}
