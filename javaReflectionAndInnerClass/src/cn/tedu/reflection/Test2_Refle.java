package cn.tedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author sharetown
 * @date 2020/8/24 11:37
 */
public class Test2_Refle {
    public static void main(String[] args) throws Exception {
        //method();//获取Class对象
//        method2();//获取构造方法
//        method3();//获取成员方法
//        method4();//获取成员变量
        method5();//通过反射技术创建对象
    }

    public static void method5() throws Exception {
        Class<Student> clazz=Student.class;
        Student stu=clazz.newInstance();//通过这种方式实例化其实也要出发构造器，而且触发的是无参构造
        System.out.println(stu);

        //如何触发含参构造
        //getConstructor(String.class)匹配构造方法里参数的类型的class对象
        Constructor<Student> c1=clazz.getConstructor(String.class);
        Constructor<Student> c2=clazz.getConstructor(String.class,int.class);
        Constructor<Student> c=clazz.getConstructor(String.class,int.class,double.class);
        Student jack=c.newInstance("jack",22,149.0);
        Student Rose=c1.newInstance("Rose");
        Student Jnmus=c2.newInstance("Jnmus",22);
        System.out.println(jack);
        System.out.println(Rose);
        System.out.println(Jnmus);
    }

    public static void method4() {
        Class clazz=Student.class;
        Field[] fields=clazz.getFields();//获取公开的成员变量（不公开无法获取）
        Field[] fields1=clazz.getDeclaredFields();//获取全部的成员变量，包括私有的=
        for (Field f:fields1) {
            System.out.println(f.getName());//获取变量名
            System.out.println(f.getGenericType());//获取数据类型
            System.out.println(f.getType());//获取数据类型
        }
    }

    public static void method3() {
        Class clazz=Student.class;
        Method[] methods=clazz.getMethods();//获取公开的所有成员方法们（包括自己的和父类的公开的方法）
        Method[] me=clazz.getDeclaredMethods();//获取自己的所有成员方法（包括私有的）

        for (Method method :me) {
            System.out.println(method.getName());//获取方法名
            Class[] cc=method.getParameterTypes();//获取每个方法的参数列表
            System.out.println(Arrays.toString(cc));
        }
    }

    public static void method2() throws NoSuchMethodException {
        Class aClass = Student.class;
        //调用方法
        Constructor[] cs = aClass.getConstructors();//获取所有公开的构造器
        Constructor c = aClass.getConstructor();//获取一个构造器，默认无参构造
        Constructor[] ccc=aClass.getDeclaredConstructors();//获取所有构造器（包括私有的）
        for (Constructor cc : ccc) {
            //获取构造方法的名字
            System.out.println(c.getName());
            //获取构造方法的参数
            Class[] ct = cc.getParameterTypes();//获取方法的参数列表
            System.out.println(Arrays.toString(ct));
        }
    }

    public static void method() throws ClassNotFoundException {
        Class aClass1 = Class.forName("cn.tedu.reflection.Student");
        Class aClass2 = Student.class;
        Class aClass3 = new Student().getClass();
    }
}
