package summarize;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sharetown
 * @date 2020/8/25 19:11
 */
public class Test {

    public static void main(String[] args) {

    }

    /**
     * 复习基本数据类型
     * byte——1字节
     * short——2字节
     * int——4字节
     * long——8字节
     * float——4字节
     * double——8字节
     * char——2字节
     * boolean——1字节
     */
    public static void dataType(){
        //问题1：能存储汉字的数据类型是？——char和int
        int a='中';
        char b='国';
        //问题2：a+=4和a=a+4的区别？——前者只是复合赋值，后者是四则运算，会涉及到数据类型的转换
        byte c=1;
        c+=4;
        //c=c+4;//会发生数据类型的转换
        //问题3：byte a=1;byte b=1;byte c=a+b是正确的么？——不正确，因为变量在进行四则运算时会发生数据类型的转换，初始化不会。
        byte d=1;
        byte e=1;
        //byte f=d+e;//变量参与的四则运算会发生数据类型的自动转换
        //问题4：
    }

    /**
     * 复习面向对象
     * 封装：利用抽象数据类型将数据和基于数据的操作封装在一起，使其构成一个不可分割的独立实体。数据被保护在抽象数据类型的内部，尽可能地隐藏内部的细节，只保留一些对外的接口使其与外部发生联系。用户无需关心对象内部的细节，但可以通过对象对外提供的接口来访问该对象。
     * 构造器：方法名与类名一致，没有返回值的方法叫构造器
     * 继承：通过extends关键字与父类发生关系，子类可直接使用父类的资源
     * 重写：在子类中，出现方法声明与父类一致的现象叫做重写
     * 多态：子类对象的引用指向父类类型的变量。一种向上转型的模式
     * 抽象类：含有抽象方法的类叫做抽象类，没有方法体被abstract关键字修饰的方法叫做抽象方法
     * 接口：只有静态常量和抽象方法的被interface修饰的文件（1.8以前）。没有接口的声明没有class关键字。1.8以后的接口允许有普通方法，普通方法必须使用默认权限修饰符或修饰成静态。接口支持多继承多实现。接口与接口之间只有继承关系，接口与类之间只有实现关系
     * 内部类：重点了解匿名内部类，可通过匿名内部类重写抽象类或接口的抽象方法进行实例化
     * 代码块：分为构造代码块、局部代码块、静态代码块。执行顺序：静态代码块 > 构造代码块 > 父类构造器 > 子类构造器 > 局部代码块
     * static关键字：可以修饰变量、方法、代码块,被static修饰的资源为静态资源，随着类的加载而加载，只加载一次，全局共享，全局唯一。静态方法和代码块只能调用静态资源。静态方法和代码块中不能出现this和super引用
     * this关键字：代表本类对象的引用
     * super关键字：代表父类对象的引用
     * final关键字：可修饰类、变量、方法。被final修饰的类为最终类不可以被继承、被final修饰的变量为常量不可以被修改，被final修饰的方法为最终方法，不可以被子类重写
     * abstract关键字：可以修饰类和方法，不能修饰变量
     */
    public static void oop(){
        //多多益善
    }

    /**
     * 复习API
     * String
     * StringBuilder/StringBuffer：常用方法append。区别StringBuilder线程不安全，效率高。StringBuffer线程安全，效率低
     * Date：
     * SimpleDtaeFormat
     * Math
     * Random
     * BigDecimal/BigInteger
     */
    public static void api(){
        String s="qwertyuiopasdfghjkklzxcvbnm";
        System.out.println(s.equals("sadfddsaf"));
        System.out.println(s.charAt(5));
        System.out.println(s.getBytes());
        System.out.println(s.toCharArray());
        System.out.println(s.indexOf("qwer"));
        System.out.println(s.length());
        System.out.println(s.substring(1,5));
        System.out.println(s.replace('o','x'));

        Date date=new Date();
        System.out.println(date.getDate());

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 复习IO流
     * 文件操作
     * File
     * 字节流
     * InputStream——读
     *     FileInputStream
     *     创建对象：new FileInputStream(new File())
     *         BufferedInputStream
     *         创建对象：new BufferedInputStream(new FileInputStream(new File()))
     * OutputStream——写
     *     FileOutputStream
     *         BufferedOutputStream
     * 字符流
     * Reader——读
     *
     *
     * Writer——写
     */
    public static void io(){

    }

    /**
     * 复习集合
     * Collection
     * 方法：
     * add()
     * remove()
     * clear()
     * size()
     *     List
     *     get()
     *         ArrayList
     *         LinkedList
     *         Vector
     *     Set
     *         HashSet
     *         TreeSet
     *         LinkedHashSet
     * Map
     * get()
     * put()
     * keySet()
     * values()
     *     HashMap
     *     HashTable
     *
     *
     * Collections
     */
    public static void collection(){
        //遍历方式
    }
}
