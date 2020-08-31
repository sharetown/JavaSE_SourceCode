package cn.tedu.hello2;
/**
 * 测试字面值
 * @author Administrator
 *
 */
public class Test_Zmz {
	public static void main(String[] args) {
		//1、整数字面值是int类型
		int a = 1000;
		//2、浮点数的字面值是double类型
		double b = 9.9;
		//3、byte、short char三种比int小的整数可以用范围内的值直接赋值
		//4、字面值的后缀（不区分大小写）l\f\d
		long l=100000000000L;
		
		/**
		 * 测试字面量
		 */
		byte z=1,x=1,c,v;
		byte m=2,n=1;
		//z=m+n;//这里会报错，因为整数的字面量是int类型，
		//可以将int类型的数据（常量）直接赋值给byte、short。
		//然而在四则运算中，只要是字面量为int类型的变量（不管是byte还是short）
		//无论与不与int类型的变量进行四则运算，系统都会自动将运算结果转换为int类型。
		//此时如果还用byte或者short类型的变量存储数据将会出错。
		
		final byte g=1,h=1;
		//z=g+h;//这里不会报错，因为被final修饰的变量为常量，
		//常量进行四则运算不会发生类型的自动转换
		//这句代码相当于z=1+1；
		
		short q=1,w=1;
		//short r=q+1;这句也会报错。
		
		/**
		 * 四则运算会发生数据转换
		 */
		
		
	}

}
