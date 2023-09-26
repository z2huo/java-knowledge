package cn.z2huo.knowledge.basic.arrays.dataGenerator;

import cn.z2huo.knowledge.basic.generic.generator.Generator;

import java.util.Random;

public class RandomGenerator {
	private static Random r = new Random();
	public static class Character implements Generator<java.lang.Character> {
		public java.lang.Character next(){
			return CountingGenreator.chars[r.nextInt(CountingGenreator.chars.length)];
		}
	}
	public static class String extends CountingGenreator.String{
		{cg = new Character();}		// ???
		public String() {}
		public String(int length) {
			super(length);
		}
	}
	public static class Integer implements Generator<java.lang.Integer>{
		private int mod = 10000;
		public Integer() {}
		public Integer(int mod) {
			this.mod = mod;
		}
		public java.lang.Integer next(){
			return r.nextInt(mod);
		}
	}
	public static class Double implements Generator<java.lang.Double>{
		public java.lang.Double next(){
			long trimmed = Math.round(r.nextDouble()*100);
			return ((double)trimmed) / 100;
		}
	}
}
