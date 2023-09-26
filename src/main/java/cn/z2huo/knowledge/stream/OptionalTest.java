package cn.z2huo.knowledge.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Author 张一卓
 * @Date 2020/7/20
 */
@Slf4j
public class OptionalTest {
    public static void main(String[] args) {
        String string = "abcd";
        String string2 = null;

        Optional.ofNullable(string2).ifPresent(log::debug);
        Optional.ofNullable(string).ifPresent(log::debug);

        int[] array = {1, 2, 4, 8, 3};
        Stream.of(array).findFirst().get();
    }
}
