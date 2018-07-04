package pers.vic.expression;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create By Vic Xu on 7/4/2018
 */
public class ExpressionOOCL {
    public static void main(String[] args) {
        String content = "OOCL是来自香港的公司，ITA是OOCL的软件学院";
        String reg = "(((?i)oocl)|(香港)|((?i)ita))";
        ExpressionOOCL e = new ExpressionOOCL();
        e.checkKeyWord(content, reg);
    }

    /**
     * 正则表达式
     * 找到OOCL，香港，ITA关键字，并统计出现次数和记录位置
     *
     * @param content
     * @param reg
     */
    private void checkKeyWord(String content, String reg) {
        Matcher m = Pattern.compile(reg).matcher(content);
        Map<String, Integer> countMap = new HashMap<>(); //出现次数
        Map<String, String> locationMap = new HashMap<>(); //详细位置，这里记录的是索引
        while (m.find()) {
            String keyWord = content.substring(m.start(), m.end());
            StringBuilder builder = new StringBuilder();
            builder.append("(").append(m.start()).append(",").append(m.end()).append(")");
            if (locationMap.containsKey(keyWord)) {
                String l = locationMap.get(keyWord) + builder.toString();
                locationMap.put(keyWord, l);
            } else
                locationMap.put(keyWord, builder.toString());
            for (int i = 1; i < m.groupCount(); i++) {
                if (keyWord.equals(m.group(i))) {
                    if (countMap.containsKey(keyWord))
                        countMap.put(keyWord, countMap.get(keyWord) + 1);
                    else
                        countMap.put(keyWord, 1);
                    break;
                }
            }
        }
        if (countMap.size() > 0 && locationMap.size() > 0) {
            System.out.println("出现次数:");
            countMap.forEach((k, v) -> System.out.println(k + ":" + v));
            System.out.println("具体位置:");
            locationMap.forEach((k, v) -> System.out.println(k + ":" + v));
        } else
            System.out.println("没出现关键字");
    }



}
