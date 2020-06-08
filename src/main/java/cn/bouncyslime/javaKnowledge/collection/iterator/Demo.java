package cn.bouncyslime.javaKnowledge.collection.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

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
