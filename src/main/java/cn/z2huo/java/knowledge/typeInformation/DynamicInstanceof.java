package cn.z2huo.java.knowledge.typeInformation;

import java.util.ArrayList;

class Dog{
	
}

public class DynamicInstanceof {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		if(ArrayList.class.isInstance(list)) {
			
		}
		Dog dog = new Dog();
		if(Dog.class.isInstance(dog)) {
			
		}
		if(dog.getClass().isInstance(dog)) {
			
		}
	}
}
