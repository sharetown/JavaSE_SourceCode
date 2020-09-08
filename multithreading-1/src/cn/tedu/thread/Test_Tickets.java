package cn.tedu.thread;

/**
 * 测试 多线程售票
 * 问题1：四个线程一共买了400张票。解决——让资源变成静态的
 * 问题2：超卖，卖出了0 和-1
 * 问题3：重卖：把同一张票卖给了好几个
 *
 * @author sharetown
 * @date 2020/8/21 17:28
 */
public class Test_Tickets {
    public static void main(String[] args) {
        //1、创建线程对象
        MyTickets myTickets1 = new MyTickets();
        //2、启动买票线程
        myTickets1.start();
        MyTickets myTickets2 = new MyTickets();
        myTickets2.start();
        MyTickets myTickets3 = new MyTickets();
        myTickets3.start();
        MyTickets myTickets4 = new MyTickets();
        myTickets4.start();


    }
}

//1、继承Thread类实现多线程编程
class MyTickets extends Thread {
    //需求：设计4个售票窗口，总计售票100张
    //定义变量，记录票数
    static int tickets = 100;
    //2、开始买票业务

    //创建对象来锁
    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (MyTickets.class) {//锁了本类，针对于静态
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);//让线程睡一会
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }//作用，让线程睡一会醒来后再进行操作，检查程序的安全性
                    System.out.println(getName() + "----" + tickets--);
                } else {
                    break;
                }
            }


        }


    }
}
