package cn.tedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 测试暴力反射
 * @author sharetown
 * @date 2020/8/24 16:05
 */
public class Test3_Refle {
    public static void main(String[] args) throws Exception {
//        method();
//        method1();
        method2();
//        method3();
    }
    public static void method(){
        Class<Person> p=Person.class;
        Constructor[] con=p.getDeclaredConstructors();
        for (Constructor c:con) {
            System.out.println(c.getName());
        }
    }
    public static void method1(){
        Class<Person> p=Person.class;
        Method[] meth=p.getDeclaredMethods();
        for (Method m:meth) {
            System.out.println(m.getName());
            System.out.println(Arrays.toString(m.getParameterTypes()));

        }
    }

    public static void method2() throws Exception {
        Class<Person> p=Person.class;
        Field[] fie=p.getDeclaredFields();
        Field ff=p.getDeclaredField("name");//拿到名为name的成员变量的对象
        ff.setAccessible(true);//打开权限
        Person obj=p.newInstance();
        ff.set(obj,"jack");//给成员变量赋值
        System.out.println(ff.get(obj));//获取成员变量的值
        for (Field f:fie) {
            System.out.println(f.getName());
            System.out.println(f.getType().getName());
        }


    }
    public static void method3() throws Exception {
        Class<Person> clszz=Person.class;
        Method e = clszz.getDeclaredMethod("eat");
        //暴力反射：除了使用正确的API，另外还需要开启访问权限
        e.setAccessible(true);
        Person p=clszz.newInstance();
        e.invoke(p);

    }

}
