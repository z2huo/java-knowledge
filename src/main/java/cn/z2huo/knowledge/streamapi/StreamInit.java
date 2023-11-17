package cn.z2huo.knowledge.streamapi;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author 张一卓
 * @Date 2020/6/22
 */
@Slf4j
public class StreamInit {
    public static void main(String[] args) {
        // 1.
        Stream<String> stream = Stream.of("a", "b", "c");
        // 2.
        String[] strings = new String[] {"d", "e", "f"};
        stream = Stream.of(strings);
        stream = Arrays.stream(strings);
        // 3.
        List<String> list = Arrays.asList(strings);
        stream = list.stream();

        /*
          以下为 数据流 ==>> 其他数据结构
         */
        String[] stringArray = stream.toArray(String[]::new);
        List<String> streamToList = stream.collect(Collectors.toList());
        List<String> streamToList2 = stream.collect(Collectors.toCollection(ArrayList::new));
        Set<String> set = stream.collect(Collectors.toSet());
        String string = stream.collect(Collectors.joining());
    }
}
