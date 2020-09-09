package socket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sharetown
 * @date 2020/8/25 16:56
 */
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader("E:\\workspase2007\\test.txt"));
        String line="";
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
    }
}
