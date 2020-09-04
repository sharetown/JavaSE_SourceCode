package cn.tedu.api;

/**
 * 测试自动装箱和自动拆箱
 * @author sharetown
 * @date 2020/8/14 22:02
 */
public class Test10_AutoboxingAndUnboxing<ss> {


    public static void main(String[] args) {
        short s=128;
        Short ss=s;//发生了自动装箱
        s=ss;//发生了自动拆箱
        short b=ss;//发生了自动拆箱

        System.out.println(b==ss);//发生了自动拆箱

        int a=10;
        Integer i=a;//JVM在底层为我们执行了Integer.valueOf(a)方法；相当于Integer i=Integer.valueOf(a)；
        a=i;//JVM在底层为我们执行了i.intValue()方法，相当于a=i.intValue()；

        Integer in1=100;
        Integer in2=100;
        Integer in3=200;
        Integer in4=200;
        System.out.println(in1==in2);//true
        System.out.println(in3==in4);//false
        //因为Integer在底层执行valueOf方法时，如果值大于128或小于-128将会new一个Integer对象来完成自动装箱
        //这里的in3和4超出了[-128,128]的范围，所以==的结果为false
        //因为Integer和其他包装类的valueOf方法的底层逻辑不一样，所以不能以Integer的情况来总结其他情况。具体问题具体分析



    }

}
