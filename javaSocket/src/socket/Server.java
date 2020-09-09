package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sharetown
 * @date 2020/8/25 14:45
 */
public class Server {
    private static final int PORT=8080;

    public static void main(String[] args) throws IOException {
        //1、开启服务器 -- 端口号自定义0—65535范围（但0-1024）已被系统占用
        //在指定的PORT端口号处等待客户端连接
        ServerSocket serverSocket=new ServerSocket(PORT);
        System.out.println("服务器已开启……");

        //2、接收客户端连接
        Socket socket=serverSocket.accept();
        System.out.println("客户端已连接……");

        //3、开始通信
        //DataInputStream dis=new DataInputStream(socket.getInputStream());
        BufferedInputStream dis=new BufferedInputStream(socket.getInputStream());
//        System.out.println(dis.readUTF());
        int date=0;
        while ((date=dis.read())!=-1){
            System.out.print((char) date);
        }
        System.out.println("\n接收成功！");
        dis.close();
        socket.close();
        serverSocket.close();
    }
    public void method(int port) throws IOException {
        ServerSocket serverSocket=new ServerSocket(port);
        Socket socket=serverSocket.accept();
        BufferedInputStream dis=new BufferedInputStream(socket.getInputStream());
        int date=0;
        while ((date=dis.read())!=-1){
            System.out.print((char) date);
        }
        dis.close();
        socket.close();
        serverSocket.close();
    }
}
