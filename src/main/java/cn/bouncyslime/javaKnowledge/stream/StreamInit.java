package cn.bouncyslime.javaKnowledge.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author 张一卓
 * @Date 2020/6/22
 */
@Slf4j
public class StreamInit {
    public static void main(String[] args) {
        // 1.
        Stream stream = Stream.of("a", "b", "c");
        // 2.
        String[] strings = new String[] {"d", "e", "f"};
        stream = Stream.of(strings);
        stream = Arrays.stream(strings);
        // 3.
        List<String> list = Arrays.asList(strings);
        stream = list.stream();
    }
}
