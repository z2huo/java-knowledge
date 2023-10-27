package cn.z2huo.knowledge.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

class ParseIntegerTest {
    public static void main(String[] args) {
        String integerString = "1212";
        Integer integer = JSON.parseObject(integerString, Integer.class);
        System.out.println(integer);
        System.out.println(integer.getClass());

        JSONObject jsonObject = JSON.parseObject(integerString);
        System.out.println(jsonObject);
    }
}
