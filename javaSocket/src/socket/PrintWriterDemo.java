package socket;

import java.io.*;

/**
 * @author sharetown
 * @date 2020/8/25 17:00
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
//        PrintWriter writer=new PrintWriter(new FileWriter("E:\\workspase2007\\test.txt"));
//        writer.println("dsadsadfasf");
//        writer.close();
        method3();
    }

    public static void method3() throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader("E:\\workspase2007\\test.txt"));
        PrintWriter writer=new PrintWriter(new FileOutputStream(new File("E:\\workspase2007\\test1.txt"),true));
        String line="";
        while ((line=reader.readLine())!=null){
            writer.println(line);
        }
        reader.close();
        writer.close();
    }


}
