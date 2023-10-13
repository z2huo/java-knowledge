package cn.z2huo.knowledge.basic.collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("zz", "aa", "yy", "zz", "yy"));
        list.remove("zz");
        System.out.println(list);
        list.removeIf("yy"::equals);
        System.out.println(list);
    }
}
