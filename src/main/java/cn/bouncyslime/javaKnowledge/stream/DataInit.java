package cn.bouncyslime.javaKnowledge.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @Author 张一卓
 * @Date 2020/6/22
 */
public class DataInit {
    public static List<Student> getStudentList(){
        Student student2 = new Student("Wang Xiaoming", "1002", 12, 74, 95);
        Student student = new Student("Han Meimei", "1003", 12, 89, 90);
        Student student3 = new Student("Zhang Xiaohong", "1005", 13, 92, 93);
        List<Student> list = Arrays.asList(student, student2, student3);
        return list;
    }
}
