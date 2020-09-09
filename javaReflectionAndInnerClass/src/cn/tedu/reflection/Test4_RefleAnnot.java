package cn.tedu.reflection;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author sharetown
 * @date 2020/8/25 9:45
 */
public class Test4_RefleAnnot {
    public static void main(String[] args) throws Exception {
        method();
    }

    public static void method() throws Exception {
        //获取Class对象
        Class clazz=Person.class;
        //获取show方法
        Method m= clazz.getDeclaredMethod("show");
        //获取Test注解
        Test test=m.getDeclaredAnnotation(Test.class);
        //创建对象
        Object obj=clazz.newInstance();
        //判断是否有Test注解
        if (test!=null){
            //调用m方法传入参数为刚刚创建的对象
            m.invoke(obj);
        }
    }
}
