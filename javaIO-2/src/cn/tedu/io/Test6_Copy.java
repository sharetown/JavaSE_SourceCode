package cn.tedu.io;

import java.io.*;
import java.util.Scanner;
/**
 * 测试文件复制
 * @author sharetown
 * @date 2020/8/17 17:15
 */
public class Test6_Copy {
    public static void main(String[] args) throws IOException {
        System.out.println("输入文件路径：");
        String fromPath=new Scanner(System.in).nextLine();
        //File from=new File("E:\\workspase2007\\testFile\\test.txt");
        File from=new File(fromPath);

        System.out.println("输入目标路径");
        String copyPath=new Scanner(System.in).nextLine();
        //File copy=new File("E:\\workspase2007\\testFile\\test1.txt");
        File copy=new File(copyPath);

        copyOf(from,copy);

    }
    public static void copyOf(File from,File copy) throws IOException {
        InputStream inputStream=new BufferedInputStream(new FileInputStream(from));
        OutputStream outputStream=new BufferedOutputStream(new FileOutputStream(copy));

        //byte[] b=new byte[1024];
        int date=0;
        while((date=inputStream.read())!=-1){
            outputStream.write(date);
        }
        //inputStream.read(b);
        //outputStream.write(b);

        inputStream.close();
        outputStream.close();

    }

}