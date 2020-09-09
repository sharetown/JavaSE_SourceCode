package cn.tedu.nbl;

/**
 * 测试匿名内部类
 * @author sharetown
 * @date 2020/8/25 10:46
 */
public class Test2_Inner {
    public static void main(String[] args) {
        new Inter(){//使用匿名内部实现接口
            @Override
            public void delete(int idNumber) {

            }
        }.delete(10);//在这里调用里面的方法
//        匿名对象一次只能执行一次任务，每次只能调用一个资源

        Inter inter=new Inter(){//起个名字
            @Override
            public void delete(int idNumber) {

            }
        };
        inter.delete(11);//此时不再是匿名对象，可以重复多次使用

    }
}

interface Inter{
    void delete(int idNumber);
}
class Imp implements Inter{
    @Override
    public void delete(int idNumber) {
        System.out.println("delete"+idNumber);
    }
}
