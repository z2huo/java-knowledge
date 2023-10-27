package cn.z2huo.knowledge.fastjson;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.List;

public class ToJSONStringTest {
    public static void main(String[] args) {
        String string = "this is a string";
        System.out.println(string);

        String jsonString = JSON.toJSONString(string);
        System.out.println(jsonString);

        String string2 = JSON.parseObject(jsonString, String.class);
        System.out.println(string2);

        List<String> stringList = Arrays.asList("string", "string2");
        System.out.println(stringList);
        String listJsonStr = JSON.toJSONString(stringList);
        System.out.println(listJsonStr);
    }
}
