package cn.z2huo.knowledge.function.predicate;

import java.util.function.Predicate;

class PredicateExample {
    public static void main(String[] args) {
        // 是否是偶数
        Predicate<Integer> isEven = n -> n % 2 == 0;
        // 是否是质数
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        // 2 是否是偶数，偶数时为true
        System.out.println(isEven.test(2));
        // 2 是否不是偶数，偶数时为false
        System.out.println(isEven.negate().test(2));
        // 2 是否是质数
        System.out.println(isPrime.test(2));
        // 4 是否是质数
        System.out.println(isPrime.test(4));
        // 2 是否即是质数，又是偶数
        System.out.println(isEven.and(isPrime).test(2));
        // 4 是否即使质数，又是偶数
        System.out.println(isEven.and(isPrime).test(4));
        // 4 是偶数或质数
        System.out.println(isEven.or(isPrime).test(4));

    }
}
