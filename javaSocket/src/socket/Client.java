package socket;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 让客户端给服务端发一个Hello
 * @author sharetown
 * @date 2020/8/25 14:45
 */
public class Client {
    private static final String HOST="127.0.0.1";
    private static final int PORT=8080;
    public static void main(String[] args) throws IOException {
        //1、连接指定服务器
        Socket socket=new Socket(HOST,PORT);
        System.out.println("服务器已连接……");

        //2、开始通信
        //DataOutputStream dos= new DataOutputStream(socket.getOutputStream());
        BufferedOutputStream dos=new BufferedOutputStream(socket.getOutputStream());
//        dos.writeUTF("Hello");
        dos.write("Hello".getBytes());
        System.out.println("传输成功！");
        dos.close();
        socket.close();

    }
    public void clientMethod(String host,int port) throws IOException {
        Socket socket=new Socket(host,port);
        BufferedOutputStream dos=new BufferedOutputStream(socket.getOutputStream());
        dos.write("Hello".getBytes());
        System.out.println("传输成功！");
        dos.close();
        socket.close();
    }
}
