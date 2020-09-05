package cn.tedu.io;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;

/**
 * IO流
 * in—输入—读
 * out—输出—写
 *
 * @author sharetown
 * @date 2020/8/15 16:09
 */
public class Test1 {
    public static void main(String[] args) throws IOException {

        File f=new File("E:\\workspase2007\\day12\\src\\cn\\tedu\\io\\test.txt");//参数是一个路径
        //File file=new File("test.txt");//参数是一个路径
        System.out.println(f.length());//获取文件的字节量
        //System.out.println(file.length());
        System.out.println(f.exists());//判断文件是否存在
        //System.out.println(file.exists());
        System.out.println(f.isFile());//判断是不是文件
        System.out.println(f.isDirectory());//判断是不是文件夹
        System.out.println(f.getName());//获取文件名
        System.out.println(f.getParent());//获取文件的父路径
        System.out.println(f.getAbsolutePath());//获取文件的完整路径
        System.out.println(f.createNewFile());//创建新文件
        System.out.println(f.mkdirs());//迭代生成多个文件夹
        System.out.println(f.mkdir());//新建文件夹
        System.out.println(f.delete());//删除文件或者空文件夹


        //列出文件夹里的资源
        String[] s=f.list();
        System.out.println(Arrays.toString(s));

        File[] ss=f.listFiles();
        System.out.println(Arrays.toString(ss));



    }
}
















