package cn.z2huo.java.knowledge.string.stringJoiner;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @Author 张一卓
 * @Date 2020/6/26
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        String arrayStart = "(";
        String arrayEnd = ")";
        StringJoiner stringJoiner = new StringJoiner(",", arrayStart, arrayEnd);
        String[] stringArray = {"Han Meimei", "Li Lei", "Zhang Xiaoming"};
        for(String string : stringArray){
            stringJoiner.add(string);
        }
        log.debug(stringJoiner.toString());

        log.info(">>> 以下为 stringJoiner 在 stream 下的应用场景");
        int[] intArray = {1, 2, 3, 4};
        String resultString = Arrays.stream(intArray).mapToObj(x -> String.valueOf(x)).collect(Collectors.joining(", "));
        log.debug(resultString);
        String resultString2 = Arrays.stream(intArray).mapToObj(x -> String.valueOf(x)).collect(Collectors.joining(", ", arrayStart, arrayEnd));
        log.debug(resultString2);
    }
}
