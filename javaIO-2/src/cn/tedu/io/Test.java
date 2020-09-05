package cn.tedu.io;

import java.io.*;

/**
 * @author sharetown
 * @date 2020/8/19 18:55
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\workspase2007\\day13\\src\\cn\\tedu\\io\\a.txt");
        System.out.println(file.length());
        OutputStream f = new FileOutputStream(new File("E:\\workspase2007\\day13\\src\\cn\\tedu\\io\\a.txt"));
        file=new File("E:\\workspase2007\\day13\\src\\cn\\tedu\\io\\a.txt");
        System.out.println(file.length());
        f.close();

    }
}
