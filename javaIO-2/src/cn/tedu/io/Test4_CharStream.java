package cn.tedu.io;


import java.io.*;

/**
 * 测试字符输入流-读
 * @author sharetown
 * @date 2020/8/17 16:32
 */
public class Test4_CharStream {
    public static void main(String[] args) throws IOException {
        method();
    }
    public static void method() throws IOException {
        Reader r=new FileReader(new File("E:\\workspase2007\\testFile\\test.txt"));
        char[] a=new char[1024];//创建一个容器，存读取的数据
        r.read(a);//传入一个容器存读取的字符
        System.out.println(a);//输出
        r.close();
    }
}
