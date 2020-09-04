package cn.tedu.api;

import java.math.BigDecimal;

/**
 * 测试大浮点数工具类BigDecimal和大整数工具类BigInteger
 *
 * @author sharetown
 * @date 2020/8/14 22:30
 */
public class Test11_BigDecimalAndBigInteger {
    public static void main(String[] args) {
        BigDecimal d=new BigDecimal(1.13);
        System.out.println(d);
        System.out.println("全部："+d);//全部：1.12999999999999989341858963598497211933135986328125
        //发现并不精确
        BigDecimal b=new BigDecimal(2.1);
        d.add(b);
        System.out.println("加："+d.add(b));//1.13。为什么不是3.35？。因为add方法并不是在原数组上进行操作
        //每次操作都会返回新的BigDecimal对象。事实上，不止加是这样，加减乘除都是这样
        System.out.println("减："+d.subtract(b));
        System.out.println("乘："+d.multiply(b));
        //d.divide(b);
//        System.out.println(d.divide(b));//报错！！运算错误。原因？？？
        BigDecimal c=new BigDecimal(2);
        System.out.println("除："+d.divide(c));//除整数不会报错
        System.out.println(""+c);
        System.out.println(d.divide(b,10,BigDecimal.ROUND_HALF_UP));//除数是小数的正确用法
        //参数分别是：除数，保留小数点后位数，格式（四舍五入、直接进位……）


//        System.out.println(d.getClass().getTypeName());



    }
}












