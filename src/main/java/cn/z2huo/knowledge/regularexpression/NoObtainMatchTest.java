package cn.z2huo.knowledge.regularexpression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>正则表达式，非获取匹配
 * <ul>
 *     <li><p>(?:pattern)</p></li>
 *     <li><p>(?=pattern)</p></li>
 *     <li><p>(?!pattern)</p></li>
 *     <li><p>(?&lt;=pattern)</p></li>
 *     <li><p>(?&lt;!pattern)</p></li>
 * </ul>
 */
public class NoObtainMatchTest {

    public static final String STR_SINGLE = "8";

    public static final String STR_DOUBLE = "8,8";

    public static final String STR_TREBLE = "8,13,8";

    public static final String STR_TREBLE_2 = "13,8,8";

    public static final String STR_TREBLE_3 = "8,8,13";

    public static final String STR = "8,13,12";

    public static final String STR_2 = "58,13,12";

    public static final String STR_3 = "111,8,12";

    public static final String STR_4 = "111,58,12";

    public static final String STR_5 = "111,222,8";

    public static final String STR_6 = "111,222,58";

    public static final Pattern NO_OBTAIN_PATTERN = Pattern.compile(".*((?<=,|^)8).*");

    public static final Pattern OBTAIN_PATTERN = Pattern.compile(".*((,|^)8).*");

    public static final Pattern PATTERN = Pattern.compile(".*(,|^)8.*");

    public static void obtainMatch() {
        System.out.println("obtain match");
        Matcher matcher = OBTAIN_PATTERN.matcher(STR_3);
        System.out.println(matcher.matches());
        if (matcher.matches()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
        }
        System.out.println();
    }

    public static void noObtainMatch() {
        System.out.println("no obtain match");
        Matcher matcher = NO_OBTAIN_PATTERN.matcher(STR_3);
        System.out.println(matcher.matches());
        if (matcher.matches()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
        }
        System.out.println();
    }

    public static void test() {
        System.out.println("pattern is " + PATTERN.pattern());
        System.out.printf("string > %s, match result > %b\n", STR, PATTERN.matcher(STR).matches());
        System.out.printf("string > %s, match result > %b\n", STR_2, PATTERN.matcher(STR_2).matches());
        System.out.printf("string > %s, match result > %b\n", STR_3, PATTERN.matcher(STR_3).matches());
        System.out.printf("string > %s, match result > %b\n", STR_4, PATTERN.matcher(STR_4).matches());
        System.out.printf("string > %s, match result > %b\n", STR_5, PATTERN.matcher(STR_5).matches());
        System.out.printf("string > %s, match result > %b\n", STR_6, PATTERN.matcher(STR_6).matches());
        System.out.println();
        System.out.printf("string > %s, match result > %b\n", STR_SINGLE, PATTERN.matcher(STR_SINGLE).matches());
        System.out.printf("string > %s, match result > %b\n", STR_DOUBLE, PATTERN.matcher(STR_DOUBLE).matches());
        System.out.printf("string > %s, match result > %b\n", STR_TREBLE, PATTERN.matcher(STR_TREBLE).matches());
        System.out.printf("string > %s, match result > %b\n", STR_TREBLE_2, PATTERN.matcher(STR_TREBLE_2).matches());
        System.out.printf("string > %s, match result > %b\n", STR_TREBLE_3, PATTERN.matcher(STR_TREBLE_3).matches());
    }

    public static void main(String[] args) {
        obtainMatch();
        noObtainMatch();
        test();

    }

}
