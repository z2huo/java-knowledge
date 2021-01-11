package cn.bouncyslime.javaKnowledge.stream;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class FilterTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] resultArray = Arrays.stream(array).filter(num -> num % 2 == 0).toArray();
        log.debug(Arrays.toString(resultArray));

        File file = new File("");
        log.debug(file.getAbsolutePath());

        String string = "";
        try (FileReader fileReader = new FileReader("src/main/resources/FilterTest.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {
//            string = bufferedReader.readLine();
//            log.debug(string);
//            Stream.of(string.split(" ")).forEach(log::debug);

            // flatMap 的作用就是将 input Stream中的层级结构扁平化，将最底层的元素抽取出来
            List<String> resultList = bufferedReader.lines().flatMap(line -> Stream.of(line.split(" ")))
                    .filter(word -> word.length() > 0).collect(Collectors.toList());
            log.debug(resultList.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
