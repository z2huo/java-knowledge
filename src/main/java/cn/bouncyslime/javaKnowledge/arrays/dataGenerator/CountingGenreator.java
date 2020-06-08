package cn.bouncyslime.javaKnowledge.arrays.dataGenerator;

import generic.generator.Generator;

public class CountingGenreator {
	public static class Boolean implements Generator<java.lang.Boolean>{
		private boolean value = false;
		public java.lang.Boolean next() {
			value = !value;
			return value;
		}
	}
	public static class Byte implements Generator<java.lang.Byte>{
		private byte value = 0;
		public java.lang.Byte next(){
			return value ++;
		}
	}
	static char[] chars = ("abcdefghijklmnopqrstyvwxyz"+"ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
	public static class Character implements Generator<java.lang.Character>{
		int index = -1;
		public java.lang.Character next(){
			// 这样做在超出长度之后仍然可以从数组开头进行。
			index = (index+1)%chars.length;
			return chars[index];
		}
	}
	public static class String implements Generator<java.lang.String>{
		private int length = 7;
		Generator<java.lang.Character> cg = new Character();
		public String() {}
		public String(int length) {
			this.length = length;
		}
		public java.lang.String next(){
			char[] buf = new char[length];
			for(int i=0; i<length; i++) {
				buf[i] = cg.next();
			}
			return new java.lang.String(buf);
		}
	}
	public static class Double implements Generator<java.lang.Double>{
		private double value = 0;
		public java.lang.Double next(){
			return value ++;
		}
	}
	public static class Integer implements Generator<java.lang.Integer>{
		private int value = 0;
		public java.lang.Integer next(){
			return value ++;
		}
	}
	//还有float，long，short没有实现
}
