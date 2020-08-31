package cn.tedu.hello;

import java.util.Scanner;

/**
 * 两个变量数值交换
 * @author sharetown
 * @date 2020年8月3日 上午11:01:09
 */
public class ExChange {
	public static void main(String[] args) {
		//使用第三临时变量的一般方法
		System.out.println("输入a");
		int a=new Scanner(System.in).nextInt();
		System.out.println("输入b");
		int b=new Scanner(System.in).nextInt();
		System.out.println("交换前：a="+a+"，b="+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("交换后：a="+a+"，b="+b);
		
		//不使用第三临时变量的异或方法
		System.out.println("输入x");
		int x=new Scanner(System.in).nextInt();
		System.out.println("输入y");
		int y=new Scanner(System.in).nextInt();
		System.out.println("交换前：x="+x+"，y="+y);
		x=x^y;
		y=y^x;
		x=x^y;
		System.out.println("交换后：x="+x+"，y="+y);
	}

}
