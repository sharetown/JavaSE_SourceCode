package cn.tedu.reflection;

/**
 * 测试反射获取Class对象的三种方式
 * @author sharetown
 * @date 2020/8/24 10:49
 */
public class Test1_Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class.forName("类的全路径");
        Class aClass = Class.forName("java.lang.String");
        System.out.println(aClass);
//        类名.class;
        System.out.println(String.class);
//        对象.getClass();
        System.out.println(new String().getClass());
    }
}
