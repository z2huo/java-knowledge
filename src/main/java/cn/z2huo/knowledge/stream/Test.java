package cn.z2huo.knowledge.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        List<String> list = Arrays.asList("xiaoming", "xiaohong", "xiaogang", "hanmeimei");
        logger.debug(list.stream().filter(x -> x.length() > 8).collect(Collectors.joining()));
        logger.debug(String.valueOf(list.stream().count()));
        logger.debug(String.valueOf(list.stream().filter(x -> x.length() > 8).count()));
        map.forEach((k,v) -> logger.debug("key: " + k + ", value: " + v));
    }

}
