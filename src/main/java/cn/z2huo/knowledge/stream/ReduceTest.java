package cn.z2huo.knowledge.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * reduce的作用主要是将stream元素组合起来，提供一个起始种子，依照运算规则，
 * 和前面Stream的第一个、第二个、第n个元素组合。字符串拼接、sum、min、max、average都是特殊的reduce
 * @Author 张一卓
 * @Date 2020/7/20
 */
@Slf4j
public class ReduceTest {
    public static void main(String[] args) {
        String concat = Stream.of("A", "B", "C", "D").reduce(",,", String::concat);
        log.debug(concat);

        String[] strings = {"abcd", "abd", "a", "adddddd"};
        int longest = Stream.of(strings).mapToInt(String::length).max().getAsInt();
        log.debug(Integer.toString(longest));

        String[] stringArray = {
                "reasoning conducted or assessed according to strict principles of validity.",
                "a system or set of principles underlying the arrangements of elements in a computer or electronic device so as to perform a specified task.",
                "hello world"
        };

        log.debug(Stream.of(stringArray).flatMap(line -> Stream.of(line.split(" "))).collect(Collectors.toList()).toString());
        List<String> list = Stream.of(stringArray).flatMap(line -> Stream.of(line.split(" "))).map(String::toUpperCase).distinct().sorted().collect(Collectors.toList());
        log.debug(list.toString());
    }
}
