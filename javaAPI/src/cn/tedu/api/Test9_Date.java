package cn.tedu.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 练习时期类及其工具类的常用方法
 * 1、Date类：
 *      getTime():获取Date对象的毫秒值
 *      setTime():设置Date对象的毫秒值
 *      getMonth():获取Date对象的月份
 *      getHours():获取Date对象的小时
 * 2、SimpleDateFormat类：
 *      parse():把日期格式字符串解析成Date
 *      format():把Date格式化成字符串
 * 3、获取系统时间戳：
 *      System.currentTimeMillis()毫秒
 *      System.nanoTime()纳秒
 *
 * @author sharetown
 * @date 2020/8/14 21:20
 */
public class Test9_Date {
    public static void main(String[] args) throws ParseException {
//        Date time=new Date();
//        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(f.format(time));
//
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//        String t="1999-08-02";
//        Date d=f.parse(t);
//        long ol=d.getTime();
//        long no=System.currentTimeMillis();
//        System.out.println((no-ol)/1000/60/60/24/365);
        testDate();

    }
    public static void testDate(){
        Date date=new Date();





        System.out.println(date.getTime());//总的秒
        System.out.println(date.getYear());//1900至今多少年
        System.out.println(date.getMonth());//过了几个月
        System.out.println(date.getDate());//几号
        System.out.println(date.getDay());//今天星期几
        System.out.println(date.getHours());//现在几时
        System.out.println(date.getMinutes());//分
        System.out.println(date.getSeconds());//秒
        System.out.println("今天是"+(1900+date.getYear())+"年"+(date.
                getMonth()+1)+"月"+date.getDate()+"日 星期"+
                date.getDay()+" 下午"+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());


    }
}
