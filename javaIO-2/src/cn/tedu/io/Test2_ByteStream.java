package cn.tedu.io;

import java.io.*;

/**
 * 测试字节流读取数据
 * 总结：
 * 1、效率上：BufferedInputStream > FileInputStreram
 * 2、原因是：BuuferedInputStream底层维护了一个byte[]，把byte[]填满了程序才读取一次
 * 减少了程序从流中读取的次数，提高了效率
 * 3、byte[]
 * @author sharetown
 * @date 2020/8/17 11:35
 */
public class Test2_ByteStream {
    public static void main(String[] args) throws IOException {
        method();//FileInputStream
        //method2();//BufferedInputStream

    }

    public static void method2() throws IOException {
        InputStream inputStream=new FileInputStream(new File("E:\\workspase2007\\testFile\\test.txt"));
        InputStream bufferedInputStream=new BufferedInputStream(inputStream);
        //这两种写法的作用是一样的
        InputStream in=new BufferedInputStream(new FileInputStream(new File("E:\\workspase2007\\testFile\\test.txt")));

        int date=in.read();
        while ((date=in.read())!=-1){
            System.out.println(date);
        }
        bufferedInputStream.close();
        in.close();




    }

    public static void method() throws IOException {
        //1、创建多态对象
        //触发String含参构造器
        InputStream in=new FileInputStream("E:\\workspase2007\\testFile\\test.txt");
        //触发File含参构造
        InputStream inputStream=new FileInputStream(new File("E:\\workspase2007\\testFile\\test.txt"));

//        byte[] b=new byte[50];
//        inputStream.read(b);
//        for (int i = 0; i <b.length ; i++) {
//            System.out.println(b[i]);
//        }
//        为什么这样输出的不一样？

        //2、开始读取
        int date=inputStream.read();
        System.out.println(date);

        //4、一直读下去。没有数据时再读取会返回-1
        while((date=inputStream.read())!=-1){
            System.out.println(date);
        }

        //3、关闭资源
        in.close();
        inputStream.close();

    }
}
