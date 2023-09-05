package cn.z2huo.java.knowledge.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author 张一卓
 * @Date 2020/6/21
 */
@Slf4j
public class ArrayStream {
    public static void main(String[] args) {

        String[] stringArray = {"Han Meimei", "Wang Xiaopeng", "Wang Gang"};

        Arrays.stream(stringArray).filter(x -> x.charAt(0) == 'W').forEach(log::debug);
    }
}
