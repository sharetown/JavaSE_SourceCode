package cn.tedu.nbl;

/**
 * @author sharetown
 * @date 2020/8/25 11:31
 */
public class Test3_Inner {
    public static void main(String[] args) {
        new Demo(){//配合匿名内部类完成抽象类的实例化
            @Override
            public void test() {

            }
        };
    }
}
abstract class Demo{
    abstract public void test();
    public void show(){
        System.out.println("show()");
    }
}

class ExDemo extends Demo{

    @Override
    public void test() {
        System.out.println("test()");
    }
}