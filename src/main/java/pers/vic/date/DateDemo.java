package pers.vic.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Create By Vic Xu on 7/4/2018
 * 日期的运用
 */
public class DateDemo {

    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Hong_kong"));
        calendar.set(1990, 8, 23, 12, 14, 10);
        calendar.get(Calendar.YEAR);

//        相互转换
        Date date = new Date();
        calendar.setTime(date);

//        时间格式化
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = format.format(date);
        System.out.println(s);
        System.out.println(format.parse(s));

    }

    /**
     * 时区ID
     */
    public static void getTimeZone() {
        for (String s : TimeZone.getAvailableIDs()) {
            System.out.println(s);
        }
    }
}
