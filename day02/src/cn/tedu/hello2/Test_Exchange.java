
package cn.tedu.hello2;

/**
 * 交换变量的值
 * 
 * @author Administrator
 *
 */
public class Test_Exchange {
	public static void main(String[] args) {
		// 1、定义变量a
		int aa = 1;
		// 2、定义变量b
		int bb = 2;
		System.out.println("交换前：a=" + aa + ",b=" + bb);
		// 3、定义变量c
		int cc;
		// 4、交换变量的值
		cc = aa;
		aa = bb;
		bb = cc;
		// 5、打印变量的值

		// 用异或的方式，不用临时变量实现变量的值交换。
		System.out.println("交换后：aa=" + aa + ",bb=" + bb);
		int m = 0;
		int n = 1;
		System.out.println("交换前：m=" + m + ",n=" + n);
		m = m ^ n;
		n = n ^ m;// n=n^m^n,根据异或的性质：a^b^a=b，则前面的表达式的结果是n=m
		m = m ^ n;// (m^n)^(n^m^n)=(m^n)^n^(m^n)=m^n^m,表达式的结果是m=n;完成了值的交换
		System.out.println("交换后：m=" + m + ",n=" + n);

		// 使用异或和移位运算符求整数的绝对值
		int x = -5;
		int y = (x ^ (x >> 31)) - (x >> 31);// 右移31是因为只取符号位
		System.out.println(y);

		// 与(&)运算符判断一个数的奇偶性
		int k = 6;
		System.out.println((k & 1) == 1 ? "奇数" : "偶数");
		// 奇数最低位肯定是1，而1的二进制最低位也是1，其他位都是0，所以所有奇数和1与运算结果肯定是1。

		// 使用乘法不引入临时变量交换两个变量的值
		int i = 12;
		int j = 21;
		i = i * j;
		j = i / j;
		i = i / j;
		System.out.println("i=" + i + ",j=" + j);

		// 使用乘法不引入临时变量交换三个变量的值
		//a=b. b=c、c=a 
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println("交换前：a=" + a + ",b=" + b+",c="+c);
		a=a*b*c;
		c=a/b/c;//a
		b=a/b/c;//c
		a=a/b/c;//b
		System.out.println("交换后：a=" + a + ",b=" + b+",c="+c);
		a = 1;
		b = 2;
		c = 3;
		a=a^b^c;
		c=a^b^c;//a
		b=a^b^c;//c
		a=a^b^c;//b
		System.out.println("交换后：a=" + a + ",b=" + b+",c="+c);
	}

}
