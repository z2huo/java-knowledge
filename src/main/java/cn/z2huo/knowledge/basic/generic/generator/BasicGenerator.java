package cn.z2huo.knowledge.basic.generic.generator;

public class BasicGenerator<T> implements Generator<T> {
	private Class<T> classType;
	public BasicGenerator(Class<T> type) {
		classType = type;
	}
	@Override
	public T next() {
//		try {
//			return classType.newInstance();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		}
//		return null;
		try {
			return classType.newInstance();
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<>(type);
	}
}
