package cn.z2huo.knowledge.basic.collection.collections;

import java.util.ArrayList;
import java.util.List;

public class Swap {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("demo");
        list.add("flag");
        list.add("mayun");

        Swap s = new Swap();
        s.printList(list);
        s.swap(list, 0, 1);
        s.printList(list);
    }

    public void swap(List<String> list, int i, int j){
        List<String> l = list;
        l.set(i, l.set(j, l.get(i)));
    }

    public void printList(List<String> list){
        for (String s : list){
            System.out.print(s+" ");
        }
        System.out.println();
    }

}
