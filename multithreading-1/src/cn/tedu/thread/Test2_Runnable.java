package cn.tedu.thread;

/**
 * @author sharetown
 * @date 2020/8/21 16:50
 */
public class Test2_Runnable {
    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
        Thread thread1=new Thread(myRunnable);
        thread1.start();
    }

}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"=="+i);
        }
    }
}