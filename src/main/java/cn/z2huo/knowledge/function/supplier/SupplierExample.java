package cn.z2huo.knowledge.function.supplier;

import java.util.Random;
import java.util.function.Supplier;

class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 100);
        System.out.println(supplier.get());
    }
}
