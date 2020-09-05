package cn.tedu.io;

import java.io.File;

/**
 * @author sharetown
 * @date 2020/8/17 10:36
 */
public class Test1_Digui {
    public static void main(String[] args) {
        String path="";
        File file=new File(path);
        long size=sizeOf(file,0);
    }
    public static long sizeOf(File file,long sum){
        File[] files=file.listFiles();
        for (File f:files) {
            if(f.isFile())
                sum+=f.length();
            else{
                sizeOf(f,sum);
            }
        }
        return sum;
    }
}
