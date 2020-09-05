package cn.tedu.io;

import java.io.*;
import java.util.Scanner;

/**
 * 练习复制文件夹
 * @author sharetown
 * @date 2020/8/18 9:54
 */
public class Test8_CopyAll {
    public static void main(String[] args) throws IOException {
        System.out.println("请输出源文件路径：");
        String fromPath=new Scanner(System.in).nextLine();
        System.out.println("请输入目标路径：");
        String copyPath=new Scanner(System.in).nextLine();
        copyAll(fromPath,copyPath);
    }

    public static void copyAll(String fromPath,String copyPath) throws IOException {
        File file=new File(fromPath);
        copyDir(file,fromPath,copyPath);
    }

    public static void copyDir(File file,String oldPath, String copyPath) throws IOException {
        new File(file.getAbsolutePath().replace(oldPath,copyPath)).mkdirs();
        File[] files=file.listFiles();
        for (File file1:files) {
            if (file1.isFile()){
                File copy=new File(file1.getAbsolutePath().replace(oldPath,copyPath));
                copyFile(file1,copy);
            }else{
                copyDir(file1,oldPath,copyPath);
            }
        }

    }

    public static void copyFile(File file1, File copy) throws IOException {
        InputStream in=new BufferedInputStream(new FileInputStream(file1));
        OutputStream out=new BufferedOutputStream(new FileOutputStream(copy));

        int date=0;
        while ((date=in.read())!=-1){
            out.write(date);
        }

        in.close();
        out.close();
    }


}

