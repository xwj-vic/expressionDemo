package pers.vic.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create By Vic Xu on 7/4/2018
 */
public class expressionCountStringDemo1 {
    public static void main(String[] args) {
//        String s = "a1w33m";
//        expressionCountStringDemo1.expressionString(s);

        String email = "vic.xu@oocl.com";
        expressionCountStringDemo1.expressionEmail(email);
    }

    public static void expressionString(String s) {
        Pattern p = Pattern.compile("\\d+");
        Matcher matcher = p.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.start() + "\t" + matcher.end());
            System.out.println(s.substring(matcher.start(), matcher.end()));
        }
    }

    /**
     * 捕获组
     *
     * @param email
     */
    public static void expressionEmail(String email) {
        String reg = "^(\\w+\\.\\w+)@(\\w+(?:\\.\\w+)+)$";
        Pattern p = Pattern.compile(reg);
        Matcher matcher = p.matcher(email);
        System.out.println(matcher.find());
        for (int i = 1; i <= matcher.groupCount(); i++)
            System.out.println(matcher.group(i));
    }

}
