package cn.z2huo.knowledge.streamapi;

import cn.z2huo.knowledge.common.entity.Class;
import cn.z2huo.knowledge.common.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author bouncyslime
 * @date 2021/5/9
 */
public class OptionalTest2 {
    public static void main(String[] args) {
        Class c = new Class();

        // NullPointerException
//        c.getStudentList().get(0).getName();

        if (c != null){
            List<Student> studentList = c.getStudentList();
            if (studentList != null) {
                Student student = studentList.get(0);
                System.out.println(student.getName());
            }
        }

        String name = c.getStudentList().stream().map(Student::getName).findFirst().orElse("hhh");

        Optional.ofNullable(c.getStudentList()).ifPresent(x -> x.stream().map(Student::getName).findFirst().orElse("hhh"));

//        Optional.of(c.getStudentList());

        List<Student> list = Optional.ofNullable(c.getStudentList()).orElse(new ArrayList<>());
        list = Optional.ofNullable(c.getStudentList()).orElseGet(() -> new ArrayList<>());

        c.setStudentList(new ArrayList<>());
        list = Optional.ofNullable(c.getStudentList()).orElse(new ArrayList<>(Arrays.asList(new Student("11", 12))));
        list = Optional.ofNullable(c.getStudentList()).orElseGet(() -> new ArrayList<>());

        System.out.println(list);

    }
}
