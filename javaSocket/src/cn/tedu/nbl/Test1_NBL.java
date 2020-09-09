package cn.tedu.nbl;

/**
 * 测试内部类
 * @author sharetown
 * @date 2020/8/25 10:18
 */
public class Test1_NBL {
    public static void main(String[] args) {
        System.out.println(new Outer().new Inner().age);
        new Outer().new Inner().in();
        Outer.Inner outIn=new Outer().new Inner();//实例化内部类对象

    }

}
class Outer{//外部类
    String name="jack";
    public void out(){
        System.out.println("out()");
//        System.out.println(age);报错！
        System.out.println(new Inner().age);//外部类想访问内部类的成员，必须创建内部类的对象
    }

    class Inner{//内部类
        int age;
        public void in(){
            System.out.println("in()");
            System.out.println(name);//内部类可以直接使用外部类的成员
        }
    }
}
