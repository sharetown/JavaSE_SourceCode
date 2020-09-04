package cn.tedu.api;

/**
 * 测试Short包装类的属性及方法的用法
 * Short与Byte一样，都有5个属性，分别是：
 * 1、BYTES-字节数
 * 2、MAX_VALUE-最大值
 * 3、MIN_VALUE-最小值
 * 4、SIZE-位数
 * 5、TYPE-原数据类型
 *
 * 方法的用法也与Byte相同，部分返回值不同，从Byte、byte变成Short、short
 * 新增一个reverseBytes静态方法
 * @author sharetown
 * @date 2020/8/14 20:21
 */
public class Test7_Short {
    public static void main(String[] args) {
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.reverseBytes(Short.MAX_VALUE));//反转short参数的二进制补码

    }
}
