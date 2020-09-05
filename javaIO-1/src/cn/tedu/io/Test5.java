package cn.tedu.io;

import java.io.File;

/**
 * 批量生成文件夹
 * 1、十层
 * 2、每层5个文件夹
 * @author sharetown
 * @date 2020/8/15 19:59
 */
public class Test5 {
    public static void main(String[] args) {
        String path="E:\\workspase2007\\day12\\src\\cn\\tedu\\io\\fileTest";
        File file=new File(path);
        int temp=0;
        String s="";
        for (int i = 0; i <10; i++) {
            path+="\\"+i;
            for (int j = 0; j <5 ; j++) {
                file=new File(path+"\\新建文件夹"+j);
                if (file.mkdirs()){
                    temp++;
                    System.out.println("创建中……");
                }

            }
        }
        System.out.println("批量创建文件夹操作结束，共完成："+temp/50.0*100+"%");
    }
}
