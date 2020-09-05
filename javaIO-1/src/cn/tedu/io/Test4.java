package cn.tedu.io;

import java.io.File;
import java.util.Scanner;

/**
 * 测试批量删除文件
 * @author sharetown
 * @date 2020/8/15 19:50
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入要批量删除文件的路径：");
        String path=new Scanner(System.in).nextLine();
        File file=new File(path);
        int temp=0;
        for (int i = 1; i <=30 ; i++) {
            file=new File(path+"\\"+i+".txt");
            if (file.delete()){
                temp++;
                System.out.println("删除中");
            }
        }
        System.out.println("批量删除文件操作已结束，共完成"+temp/30.0*100+"%");
    }
}
