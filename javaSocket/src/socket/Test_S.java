package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author sharetown
 * @date 2020/8/25 15:42
 */
public class Test_S {
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
        DataInputStream dis=new DataInputStream(socket.getInputStream());
        DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        new ReadThread(dis).start();
        new WriteThread(dos,s).start();
        dis.close();
        dos.close();
        socket.close();
        serverSocket.close();
    }
}

class ReadThread extends Thread{
    private DataInputStream dis;
    public ReadThread(DataInputStream dis){
        this.dis=dis;
    }
    @Override
    public void run() {
        super.run();
        try {
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class WriteThread extends Thread{
    private DataOutputStream dos;
    private String string;

    public WriteThread(DataOutputStream dos,String string){
        this.dos=dos;
        this.string=string;
    }

    @Override
    public void run() {
        super.run();
        try {
            dos.writeUTF(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}