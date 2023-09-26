package cn.z2huo.knowledge.common.entity;

import java.util.List;

/**
 * @author bouncyslime
 * @date 2021/5/9
 */
public class Class {
    private String className;

    private String classNo;

    private List<Student> studentList;

    public Class() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
