package cn.z2huo.knowledge.basic.polymorphism.constructionAndPoly;

class Glyph{
	void draw() {
		System.out.println("Glyph.draw()");
	}
	public Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlypy extends Glyph{
	private int radius = 1;
	public RoundGlypy(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius="+radius);
	}
	void draw() {
		System.out.println("RoundGlyph.draw(), radius=" + radius);
	}
}

public class PolyConstructor {
	public static void main(String[] args) {
		new RoundGlypy(4);
	}
}
