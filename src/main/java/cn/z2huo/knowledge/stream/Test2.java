package cn.z2huo.knowledge.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test2 {

    private static Logger logger = LoggerFactory.getLogger(Test2.class);

//    public static void main(String[] args) {
//        List<Student> list = DataInit.getStudentList();
//
//        // 过滤出 语文成绩小于 80分的同学
//        logger.info(">>>>> 以下为过滤语文成绩小于80分的学生及人数");
//        List list1;
//        int count;
//        count = (int) list.stream().filter(x -> x.getChineseScore() < 80).count();
//        logger.debug(Integer.toString(count));
//        list1 = list.stream().filter(x -> x.getChineseScore() < 80).collect(Collectors.toList());
//        logger.debug(list1.toString());
//
//        logger.info(">>>>> 以下为将所有学生的姓名放到一个List中");
//        List<String> list2;
//        list2 = list.stream().map(Student::getName).collect(Collectors.toList());
//        logger.debug(list2.toString());
//
//        List list3;
////        list3 = list.stream().map(Student::getName).collect(Collectors.toCollection(() -> ));
//
//        logger.info(">>>>> 以下为将所有学生按照姓名首字母顺序进行排序输出");
//        list.stream().sorted((o1, o2) -> {
//            if (o1.getName().charAt(0) > o2.getName().charAt(0)){
//                return 1;
//            }else if (o1.getName().charAt(0) < o2.getName().charAt(0)){
//                return -1;
//            }else{
//                return 0;
//            }
//        }).forEach(x -> {logger.debug(x.toString());});
//
//        logger.info((">>>>> 以下为map的一些用法"));
//        logger.debug(list.stream().map(x -> x.getAge() + 10).findFirst().get().toString());
//        list.stream().map(x -> x.getAge() + 10).forEach(x -> {logger.debug(x.toString());});
//        logger.debug(list.toString());
//        list.stream().map(x -> {
//            x.setName(x.getName() + " modified");
//            return x;
//        }).forEach(x -> logger.debug(x.toString()));
//        logger.debug(list.toString());
//        logger.debug(String.valueOf(list.stream().mapToDouble(Student::getAge).findAny().getAsDouble()));
//    }
}