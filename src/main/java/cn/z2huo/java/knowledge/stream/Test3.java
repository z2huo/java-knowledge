package cn.z2huo.java.knowledge.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
/**
 * 将流的层级结构扁平化，将底层元素抽出来
 */
public class Test3 {
    public static void main(String[] args) {
        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1, 2),
                Arrays.asList(5, 6),
                Arrays.asList(8, 9, 3)
        );

        Stream<Integer> outputStream = inputStream.flatMap((list) -> list.stream());

        outputStream.forEach(num -> log.debug(num.toString()));

    }
}
