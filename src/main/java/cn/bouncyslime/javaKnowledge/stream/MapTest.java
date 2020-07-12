package cn.bouncyslime.javaKnowledge.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author 张一卓
 * @Date 2020/6/20
 **/
@Slf4j
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "value1");
        map.put("k2", "value2");
        map.put("k3", "value3");

        log.info(">>> map 通过 stream foreach");
        map.forEach((k, v) -> {
            log.debug("key: " + k + ", value: " + v);
        });

        log.info(">>> map 通过 entry");
        for (Map.Entry<String, String> entry : map.entrySet()){
            log.debug("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        log.info(">>> map 通过 keyset");
        for (String key : map.keySet()){
            log.debug("key: " + key + ", value: " + map.get(key));
        }

        log.info(">>> map 通过 entryset iterator 迭代器");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            log.debug("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }
}
