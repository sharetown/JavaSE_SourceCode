package cn.tedu.thread;

/**
 * @author sharetown
 * @date 2020/8/22 10:15
 */
public class Tickets_Runnable {
    public static void main(String[] args) {
        T_R tr = new T_R();

        Thread t1 = new Thread(tr);
        Thread t2 = new Thread(tr);
        Thread t3 = new Thread(tr);
        Thread t4 = new Thread(tr);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class T_R implements Runnable {
    static int tickets = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);//让线程睡一会
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }//作用，让线程睡一会醒来后再进行操作，检查程序的安全性
                    System.out.println(Thread.currentThread().getName() + "----" + tickets--);
                } else {
                    break;
                }
            }


        }


    }
}
