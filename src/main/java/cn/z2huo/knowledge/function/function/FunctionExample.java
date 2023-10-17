package cn.z2huo.knowledge.function.function;

import java.util.function.Function;

/**
 * {@link Function} 示例
 */
class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, Integer> function = x -> x * x;

        int result = function.apply(12);
        System.out.println(result);
    }

}
