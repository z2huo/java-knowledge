package cn.z2huo.knowledge.streamapi;

import lombok.extern.slf4j.Slf4j;

/**
 * @User: 张一卓
 * @Date: 2020/7/12
 **/
@Slf4j
public class ForeachAndPeekTest {
//    public static void main(String[] args) {
//        List<Student> studentList = DataInit.getStudentList();
//        Stream<Student> studentStream = studentList.stream();
//
//        studentStream.filter(x -> x.getAge() < 13).forEach(x -> log.debug(x.getName()));
//        // foreach 是 terminal 操作，无法连续两次对同一个 stream 进行两次 foreach 操作
////        studentStream.filter(x -> x.getAge() < 13).forEach(x -> log.debug(x.getName()));
//
//        log.info(">>> peek");
//        // peek 为将元素取出来，进行某些操作，之后再放回去
//        studentStream = studentList.stream();
//        List<String> strList = studentStream.filter(x -> x.getAge() < 13)
//                .peek(x -> log.debug(x.getName()))
//                .map(x -> x.getName())
//                .map(String::toUpperCase)
//                .peek(log::debug)
//                .collect(Collectors.toList());
//        log.debug(strList.toString());
//
//        log.info(">>> peek");
//        studentStream = studentList.stream();
//        List<String> strList2 = studentStream.filter(x -> x.getAge() < 13)
//                .peek(x -> log.debug(x.getName()))
//                .map(x -> x.getName())
//                .peek(String::toUpperCase)
//                .collect(Collectors.toList());
//        log.debug(strList2.toString());
//
//        log.info(">>> peek");
//        Stream<List<Student>> inputStream = Stream.of(
//                DataInit.getStudentList(),
//                DataInit.getStudentList()
//        );
//        // 这里有疑问，为什么不加 collect，peek中的东西就打印不出来
//        // 查阅资料后可得，只有加上终止操作，才真正开始流的遍历
////        inputStream.peek(x -> log.debug(x.toString())).collect(Collectors.toList());
//        log.info(">>> peek");
////        inputStream.forEach(x -> log.debug(x.toString()));
//        List<List<Student>> resultList = inputStream.peek(x -> x.get(0).setAge(50)).collect(Collectors.toList());
////        List<List<Student>> resultList2 = inputStream.peek(x -> x.get(0).setAge(50)).collect(Collectors.toList());
//        log.debug(resultList.toString());
//    }
}
