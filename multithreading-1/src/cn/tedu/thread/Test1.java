package cn.tedu.thread;

/**
 * @author sharetown
 * @date 2020/8/21 9:10
 */
public class Test1 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();//就绪状态
         myThread.setName("--线程1--");
        myThread.start();//可运行状态
        MyThread myThread1=new MyThread();
        myThread1.setName("--线程2--");
        myThread1.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {//运行状态
        super.run();
        for (int i = 0; i < 20; i++) {
            System.out.println(getName());
        }
    }
    //死亡（结束）状态
}
