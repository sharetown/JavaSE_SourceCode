package cn.tedu.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sharetown
 * @date 2020/8/17 9:21
 */
public class Test_Date {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=s.format(date);//Date类型的数据转字符串String
        System.out.println(str);

        String dateString="1999-08-02 10:00:00";
        Date a=s.parse(dateString);//字符串String转Date类型的数据
        System.out.println(a);
    }
}
