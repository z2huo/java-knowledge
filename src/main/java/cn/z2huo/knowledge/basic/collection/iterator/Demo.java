package cn.z2huo.knowledge.basic.collection.iterator;

import java.util.*;

public class Demo{
    public static void display(Iterator<String> iterator){
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        String[] stringarray = new String[] {"121","122","123"};
        List<String> list = Arrays.asList(stringarray);
        ArrayList<String> arrayList = new ArrayList<>(list);
        HashSet<String> hashSet = new HashSet<>(list);
        display(list.iterator());
        display(arrayList.iterator());
        display(hashSet.iterator());
    }
}
