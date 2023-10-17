package cn.z2huo.knowledge.function.consumer;

import java.util.function.Consumer;

class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> consumer = n -> System.out.println(n * n);
        consumer.accept(12);

        Consumer<Integer> consumer2 = System.out::println;
        consumer2.andThen(consumer).accept(11);
    }
}
