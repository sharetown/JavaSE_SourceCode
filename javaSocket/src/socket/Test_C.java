package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author sharetown
 * @date 2020/8/25 15:42
 */
public class Test_C {
    private static final String HOST="127.0.0.1";
    private static final int PORT=8080;
    public static void main(String[] args) throws IOException {
        //1、连接指定服务器
        Socket socket=new Socket(HOST,PORT);
        System.out.println("服务器已连接……");

        //2、开始通信
        DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
        DataInputStream dis=new DataInputStream(socket.getInputStream());
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        new ReadThread(dis).start();
        new WriteThread(dos,s).start();
        dos.close();
        dis.close();
        socket.close();

    }
}
