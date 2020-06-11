package cn.bouncyslime.javaKnowledge.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

    private static Logger logger = LoggerFactory.getLogger(Test2.class);

    public static void main(String[] args) {
        Student student = new Student("Han Meimei", "1003", 12, 89, 90);
        Student student2 = new Student("Wang Xiaoming", "1002", 12, 74, 95);
        Student student3 = new Student("Zhang Xiaohong", "1005", 13, 92, 93);
        List<Student> list = Arrays.asList(student, student2, student3);

        // 过滤出 语文成绩小于 80分的同学
        logger.debug(String.valueOf(list.stream().filter(x -> x.getChineseScore() < 80).count()));
        logger.debug(list.stream().filter(x -> x.getChineseScore() < 80).findAny().get().toString());
//        logger.debug(list.stream().filter(x -> x.getChineseScore() > 80).collect().toString());

        List<String> list2 = new ArrayList<>();
        list2 = list.stream().map(Student::getName).collect(Collectors.toList());
        logger.debug(list2.toString());

    }
}
