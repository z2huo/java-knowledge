package cn.z2huo.java.knowledge.generic;

public class ThreeTuple<T,T1,T2> extends TwoTuple<T,T1>{
	public final T2 t3;
	
	public ThreeTuple(T t1, T1 t2, T2 t3) {
		super(t1, t2);
		this.t3 = t3;
	}

	@Override
	public String toString() {
		return "ThreeTuple [t1=" + t1 + ", t2=" + t2 + ", t3=" + t3 + "]";
	}
}
