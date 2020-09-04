package cn.tedu.api;

import java.util.Date;

/**
 * 测试字符串的工具类StringBuilder和StringBuffer
 * @author sharetown
 * @date 2020/8/14 17:00
 */
public class Test4_StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        method();

    }
    public static void method(){
        String s=new String("qwertyuiopasdfghjklzxcvbnm");
        String ss="";
//        long a=System.currentTimeMillis();//当前系统时间的毫秒值
//        for (int i = 0; i <10000; i++) {
//            bs.append(s);
//        }
//        long b=System.currentTimeMillis();
//        System.out.println((b-a)/1000.0+"s");//两个时间值相减除以1000即可得到运行了几秒
        //1.9s左右
        StringBuilder bs=new StringBuilder("");
        long a=System.currentTimeMillis();//当前系统时间的毫秒值
        for (int i = 0; i <10000; i++) {
            bs.append(s);
        }
        long b=System.currentTimeMillis();
        System.out.println((b-a)/1000.0+"s");//两个时间值相减除以1000即可得到运行了几秒
        //0.001s
    }
}
