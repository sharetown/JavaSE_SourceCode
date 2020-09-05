package cn.tedu.io;

import java.io.File;
import java.util.Scanner;

/**
 * @author sharetown
 * @date 2020/8/18 8:49
 */
public class Test7_Fuxi {
    public static void main(String[] args) {
        System.out.println("请输入路径：");
        String path=new Scanner(System.in).nextLine();
        File file=new File(path);
        //System.out.println(method1(file));
    }
    public static int method1(File file){
        int sum=0;
        File[] files=file.listFiles();
        for (File f:files) {
            if (f.isFile()){
                sum+=f.length();
            }else{
                sum+=method1(f);
            }
        }
        return sum;
    }

}
