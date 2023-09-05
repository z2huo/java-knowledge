package cn.z2huo.java.knowledge.generic;

public class TwoTuple<T,T1> {
    public final T t1;
    public final T1 t2;
    public TwoTuple(T t1, T1 t2){
        this.t1 = t1;
        this.t2 = t2;
    }
	@Override
	public String toString() {
		return "TwoTuple [t1=" + t1 + ", t2=" + t2 + "]";
	}
	
	static TwoTuple<String, Integer> resolve() {
		return new TwoTuple<String, Integer>("hhh", 2);
	}
	
	static ThreeTuple<String, Integer, Double> resolve2(){
		return new ThreeTuple<String, Integer, Double>("adfa", 1, 2.2);
	}
	
	public static void main(String[] args) {
		System.out.println(resolve());
		System.out.println(resolve2());
	}
}
