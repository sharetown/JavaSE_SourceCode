package cn.tedu.io;

import java.io.File;

/**
 * IO流的练习
 * 接收用户输入的文件夹路径，并列出所有资源，并求所有文件的总大小
 * @author sharetown
 * @date 2020/8/15 17:14
 */
public class Test2 {
    public static void main(String[] args) {
        File file=new File("E:\\workspase2007\\day12\\src\\cn\\tedu\\io\\fileTest");
        String[] f=file.list();
        File[] fs=file.listFiles();
        int sum=0;
        for (File o:fs) {
            System.out.print(o.getName()+"  ");
            if (o.isFile()){
                sum+=o.length();
            }

        }
        System.out.println("\n"+sum);

        sum=0;
        for (String o:f) {
            System.out.print(o+"  ");
            file=new File("E:\\workspase2007\\day12\\src\\cn\\tedu\\io\\fileTest\\"+o);
            if (file.isFile()){
                sum+=file.length();
            }
        }
        System.out.println("\n"+sum);

    }
}
