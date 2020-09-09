package cn.tedu.lambda;

/**
 * @author sharetown
 * @date 2020/8/26 16:46
 */
public class TestLambda {
    public static void main(String[] args) {
        //匿名内部类
        Inter in=new Inter() {
            @Override
            public void save() {
                System.out.println("数据保存成功");
            }
        };
        in.save();
        //Lambda表达式——要求：接口里只能有一个抽象方法
        //语法：（参数列表）->{方法体}
        Inter inter=()->{
            System.out.println("Lambda表达式");
        };
        inter.save();

        Inter2 inter2=(int a)->{
            System.out.println(a);
        };
        inter2.save(10);

        Inter3 inter3=(String name)->{
          return 100;
        };
        System.out.println(inter3.save("das"));
    }
}
interface Inter{
    void save();
}
interface Inter2{
    void save(int id);
}
interface Inter3{
    int save(String name);
}