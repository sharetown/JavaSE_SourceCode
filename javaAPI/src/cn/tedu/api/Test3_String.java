package cn.tedu.api;

import java.util.Arrays;

/**
 *
 */
public class Test3_String {
    public static void main(String[] args) {
        //1、创建String对象
        char[] cs=new char[]{'a','b','c','d'};
        String s=new String(cs);

        String str="hello world";
        //2、调用方法
        System.out.println(str.charAt(2));//返回指定索引处的char字符
        System.out.println(str.concat(s));//在str末尾拼接上s
        System.out.println(str.endsWith("d"));//判断str是否以字符串“d”结尾
        System.out.println(str.equals("helloworld"));//判断两个字符对象的值是否相等
        System.out.println(str.length());//返回字符串的长度
        System.out.println(str.lastIndexOf("d"));//返回子串最后一次出现的下标索引
        System.out.println(str.lastIndexOf('d'));//返回Unicode对象字符最后一次出现的索引
        System.out.println(str.lastIndexOf('o',5));//返回Unicode对应字符在被截断后的新串中最后一次出现的索引。
        System.out.println(str.startsWith("h"));//判断str是否以子串开头
        System.out.println(str.startsWith("h",5));//判断被截断后的新串是否以指定子串开头
        System.out.println(str.isEmpty());//判断字符串是否为空
        System.out.println(str.indexOf("o"));//获取指定子串在字符串中第一次出现的索引
        System.out.println(Arrays.toString(str.split(" ")));//根据指定的规则切割字符串,成字符数组
        System.out.println(str.split(" ").getClass().getTypeName());
        System.out.println(str.replace('o','n'));//使用新字符替换旧字符，返回新字符串
        System.out.println(str.substring(5));//返回从指定索引开始往后截取的新的子串
        System.out.println(str.toLowerCase());//转换成全小写
        System.out.println(str.toUpperCase());//转换成全大写
        System.out.println(str.trim());//去除前后的空格
        System.out.println(String.valueOf(400882088));//把对象转化为字符串类型
        System.out.println(Arrays.toString(str.toCharArray()));//返回字符串的字符数组
        System.out.println(Arrays.toString(str.getBytes()));//返回字符串的字符数组的byte数组


        str="qwertyuiop";
        //打印字符串里的每个字符
        for (int i = 0; i <str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        char[] c=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(c[i]);
        }
}
}
