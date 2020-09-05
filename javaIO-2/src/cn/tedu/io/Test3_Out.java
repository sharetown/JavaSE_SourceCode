package cn.tedu.io;

import java.io.*;

/**
 * 测试输出流--写
 *
 * @author sharetown
 * @date 2020/8/17 15:59
 */
public class Test3_Out {
    public static void main(String[] args) throws IOException {
        //method();
        method2();
    }

    public static void method() throws IOException {
        //1、创建多态对象
        OutputStream out = new FileOutputStream(new File("E:\\workspase2007\\testFile\\test.txt"),true);
        //2、开始写出
        String s="牛顿莱布尼茨";
        byte[] b=s.getBytes();
        out.write(b);
        //3、关闭资源
        out.close();
    }
    public static void method2() throws IOException {
        OutputStream out=new BufferedOutputStream(new FileOutputStream(new File("E:\\workspase2007\\testFile\\test.txt"),true));
        String s="要想生活过的去";
        byte[] b=s.getBytes();
        out.write(97);
        out.write(98);
        out.write(99);
        out.write(b);
        //out.write(b,1,2);
        out.close();
    }


}
