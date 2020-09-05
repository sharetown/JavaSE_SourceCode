package cn.tedu.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 测试一次性创建多个文件
 * @author sharetown
 * @date 2020/8/15 19:40
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入要批量创建文件的路径：");
        String path=new Scanner(System.in).nextLine();
        File file=new File(path);
        System.out.println("创建文件开始……");
        int temp=0;
        for (int i = 1; i <=30; i++) {
            file=new File(path+"\\"+i+".txt");
            System.out.println("创建中……");
            if (file.createNewFile()){
                temp++;
            }
        }
        System.out.println("创建文件结束，共完成"+ temp/30.0*100+"%");

    }
}
