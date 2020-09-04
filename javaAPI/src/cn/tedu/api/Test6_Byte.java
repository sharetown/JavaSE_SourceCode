package cn.tedu.api;

/**
 * 测试Byte包装类的属性及方法的用法
 * @author sharetown
 * @date 2020/8/14 19:16
 */
public class Test6_Byte {
    public static void main(String[] args) {
        byte a=107;
        Byte b=new Byte(a);
        //属性测试开始
        System.out.println("---Byte类的属性测试开始---");
        System.out.print("Byte的原始类型：");
        System.out.println(Byte.TYPE);//Byte的原始类型
        System.out.println("Byte的字节数："+Byte.BYTES);//原类型的字节数
        System.out.println("Byte的位数："+Byte.SIZE);//原始类型byte的位数
        System.out.println("Byte的最小值："+Byte.MIN_VALUE);//byte的最小值
        System.out.println("Byte的最大值："+Byte.MAX_VALUE);//byte的最大值
        //属性测试结束
        //方法测试开始
        System.out.println("---Byte类的属性测试结束---");
        System.out.println("---Byte类的方法测试开始---");
        Byte by=new Byte("123");
        System.out.println("调用传入字符串参数的构造器构建的对象的类型为："+by.getClass().getTypeName());
        System.out.println("byteValue方法返回Byte对象的byte值："+by.byteValue());//返回Byte对象的byte值
        System.out.println("静态方法compace用于比较两个byte的值之间的差（123，12）："+Byte.compare((byte)123,(byte)12));//返回两个byte值之间的差
        System.out.println("compaceTo方法用于比较两个Byte对象的差值(123.compaceTo(107))："+by.compareTo(b));//返回比较两个Byte对象的差值
        System.out.println("静态方法decode方法用于将字符串解码成Byte,decode(\"123\")："+Byte.decode("123"));//用于将字符串解码成Byte
        System.out.println("doubleValue方法用于将Byte转换成double类型："+by.doubleValue());
        System.out.println("equals方法用于比较两个对象的值，前提是参数的类型需为Byte的实现类，否则直接false"+b.equals(107));
        Byte aa=new Byte(a);
        Byte bb=new Byte(a);
        System.out.println("byte a=107;\nByte aa=new Byte(a);\nByte bb=new Byte(a);\naa.equals(bb):"+aa.equals(bb));
        System.out.println("floatValue方法用于将Byte转换为float类型："+by.floatValue());
        System.out.println("hashCode方法用于返回Byte的hash值，结果与调用intValue方法一致："+by.hashCode());
        System.out.println("静态方法parseByte用于将字符串转化成十进制的byte："+Byte.parseByte("123"));//只能转化十进制字符串
        System.out.println("静态方法parseByte（String，int）将任意指定的进制字符串转换为十进制数值："+Byte.parseByte("123",10));//将由第二个参数指定的其他进制字符串转换为十进制数值
        System.out.println(Byte.parseByte("2D",16));//只能转换指定进制的字符串，又第二个参数指定
        System.out.println("静态方法toUnsignedInt方法用于将Byte转换为int:"+Byte.toUnsignedInt(by));
        System.out.println("静态方法toUnsignedILong方法用于将Byte转换为long:"+Byte.toUnsignedLong(by));
    }
}
