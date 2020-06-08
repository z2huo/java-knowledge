package cn.bouncyslime.javaKnowledge.dateAndTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatDemo {

    public static void demo() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(simpleDateFormat.format(date));

        String dateString = "2019.01.09";
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.CHINA);
        simpleDateFormat2.applyPattern("yyyy.MM.dd");
        try {
            Date date2 = simpleDateFormat2.parse(dateString);
            System.out.println(date2);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(simpleDateFormat.toPattern());
    }

    public static void demo2() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND, 60);
        System.out.println(calendar.getTime());
    }

    public static void demo3() {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) DateFormat.getDateTimeInstance();
        Date date = new Date();
        simpleDateFormat.applyPattern("今年是yyyy年MM月dd日 E HH点mm分ss秒");
        System.out.println(simpleDateFormat.format(date));

    }

    public static void main(String[] args) {
        demo();
        System.out.println();
        demo2();
        System.out.println();
        demo3();
    }
}
