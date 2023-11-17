package cn.z2huo.knowledge.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class SortedExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 12, 3);

        List<Integer> integers = list.stream().sorted(Comparator.comparing(Integer::intValue).reversed())
                .collect(Collectors.toList());
        System.out.println(integers);
    }

}
