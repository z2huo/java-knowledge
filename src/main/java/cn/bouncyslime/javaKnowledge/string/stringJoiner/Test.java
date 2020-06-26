package cn.bouncyslime.javaKnowledge.string.stringJoiner;

import lombok.extern.slf4j.Slf4j;

import java.util.StringJoiner;

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
    }
}
