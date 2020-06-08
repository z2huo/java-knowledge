package cn.bouncyslime.javaKnowledge.stream;

public class Student {
    private String name;
    private String number;
    private int age;
    private int chineseScore;
    private int mathScore;

    public Student(String name, String number, int age, int chineseScore, int mathScore) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", age=" + age +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                '}';
    }
}
