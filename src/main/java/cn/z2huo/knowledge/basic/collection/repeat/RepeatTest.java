package cn.z2huo.knowledge.basic.collection.repeat;

import java.util.*;

public class RepeatTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(200000);
        Random random = new Random();
        random.setSeed(55555);
        for (int i = 0; i < 200000; i++) {
            stringList.add(String.valueOf(random.nextInt()));
        }

        List<String> subList = new ArrayList<>(stringList.subList(2000, 2500));

        long start = System.currentTimeMillis();
        for (String s : subList) {
            if (stringList.contains(s)) {

            }
        }
//        if (stringList.contains("22222")) {
//            System.out.println("contain");
//        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);

        start = System.currentTimeMillis();
        Set<String> set = new HashSet<>(stringList);
        for (String s : subList) {
            if (set.contains(s)) {

            }
        }
//        if (set.contains("22222")) {
//            System.out.println("hashset contain");
//        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
