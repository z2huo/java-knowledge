package cn.z2huo.java.knowledge.exception.returnInException;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	
	public static int demo() {
		int b = 20;
		try {
			System.out.println("try block");
			return b += 50;
		} catch (Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
			if (b > 20) {
				System.out.println("b>20, b="+b);
			}
		}
		return b;
	}
	
	public static void demo2() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
	}
	
	/**
	 * 用来判断finally中的return
	 * @return
	 */
	public static int demo3() {
		int a = 20;
		try {
			System.out.println("try block");
			return a += 30;
		} catch (Exception e) {
			System.out.println("catch block");
			return a += 50;
		}finally {
			System.out.println("finally block");
			if (a > 20) {
				System.out.println("b>20, a="+a);
			}
			return 100;
		}
	}
	
	/**
	 * 用来判断finally中的return
	 * @return
	 */
	public static int demo33() {
		try {
			System.out.println("try block");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch block");
			return 80;
		}finally {
			return 100;
		}
	}
	
	/**
	 * finally是否会修改其他块中的内容
	 * @return
	 */
	public static int demo333() {
		int a = 20;
		try {
			System.out.println("try block");
			return a += 30;
		} catch (Exception e) {
			System.out.println("catch block");
			return a += 50;
		}finally {
			System.out.println("finally block");
			a += 80;
			System.out.println(a);
		}
	}
	public static Map<String,String> demo3333() {
		Map<String, String> map = new HashMap<>();
		map.put("key", "11111");
		try {
			map.put("key", "22222");
			return map;
		} catch (Exception e) {
			map.put("key", "33333");
		} finally {
			map.put("key", "finally");
			map = null;
//			map.put("name", "zyz");
		}
		return map;
	}
	
	public static int demo4() {
		int b = 20;

        try {
            System.out.println("try block");

            b = b / 0;

            return b += 80;
        } catch (Exception e) {

            b += 15;
            System.out.println("catch block");
        } finally {

            System.out.println("finally block");

            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }

            b += 50;
        }

        return b;
	}
	
	public static int demo44() {
		int b = 20;
		 try {
	            System.out.println("try block");

	            b = b /0;

	            return b += 80;
	        } catch (Exception e) {

	            System.out.println("catch block");
	            return b += 15;
	        } finally {

	            System.out.println("finally block");

	            if (b > 25) {
	                System.out.println("b>25, b = " + b);
	            }

	            b += 50;
	        }
	}
	
	public static void main(String[] args) {
//		System.out.println(demo());
//		System.out.println(demo2());
//		demo2();
		System.out.println("demo3()");
		System.out.println(demo3());
		System.out.println("\ndemo33()");
		System.out.println(demo33());
		System.out.println("\ndemo333()");
		System.out.println(demo333());
		System.out.println("\ndemo3333()");
		Map<String, String> map = demo3333();
		System.out.println(map);
		map.put("hhh", "hahaha");
		System.out.println(map);
		System.out.println("\ndemo4()");
		System.out.println(demo4());
		System.out.println("\ndemo44()");
		System.out.println(demo44());
	}
}
