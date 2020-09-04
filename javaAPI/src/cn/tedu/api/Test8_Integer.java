package cn.tedu.api;

/**
 * 测试Integer包装类
 * 同样拥有5个属性
 * 新增多个方法
 * @author sharetown
 * @date 2020/8/14 20:44
 */
public class Test8_Integer {
    public static void main(String[] args) {
        Integer i=new Integer(123456);
        System.out.println(Integer.bitCount(3));//返回int参数的二进制的位数
        System.out.println(Integer.compareUnsigned(-123,-123));//比较两int参数的值，两个数同时加上int的最小值后做比较。
        //如果有负数将会被处理为无符号数。详见源码。返回值有3种-1、0、1。相等必返回零
        System.out.println(Integer.getInteger("i"));//???
        System.out.println(Integer.highestOneBit(3));//返回int参数的二进制种最高位为1的10进制数值
        System.out.println(Integer.lowestOneBit(256));//返回int参数的二进制最低为不为0的10进制数值
        System.out.println(Integer.max(75,5));
        System.out.println(Integer.min(75,5));
        System.out.println(Integer.numberOfLeadingZeros(3));//???
        System.out.println(Integer.numberOfTrailingZeros(3));//???
        System.out.println(Integer.signum(8));//??
        System.out.println(Integer.toBinaryString(255));//返回二进制表达形式
        System.out.println(Integer.toOctalString(255));//返回八进制表达形式
        System.out.println(Integer.toHexString(255));//返回十六进制表达形式
        System.out.println(Integer.toUnsignedLong(-123456789));//转换成无符号long
        System.out.println(Integer.toUnsignedString(123456789));//转换成无符号的十进制的数字字符串
        System.out.println(Integer.toUnsignedString(123456789,8));//转换成无符号的任意指定进制的数字字符串


    }
}
