package cn.bouncyslime.javaKnowledge.loopAndBranch.label;

public class LabelDemo {
	public static void main(String[] args) {
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		outer:
		for(int i=0; i<array.length; i++) {
			inner:
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
				if (array[i][j] == 5) {
					break outer;
//					break inner;
//					continue outer;
//					continue inner;
				}
			}
		}
	}
}
