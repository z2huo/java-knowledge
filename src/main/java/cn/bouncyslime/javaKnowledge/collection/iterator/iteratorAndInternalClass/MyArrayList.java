package cn.bouncyslime.javaKnowledge.collection.iterator.iteratorAndInternalClass;

import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E>{
	
	private int size;
	
	private E[] items;
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

class ArrayListIterator<E> implements Iterator<E>{
	
	private int current = 0;
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
