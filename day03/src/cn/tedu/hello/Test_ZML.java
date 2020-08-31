package cn.tedu.hello;

import java.util.Scanner;

/**
 * 测试字面量
 * @author sharetown
 * @date 2020年8月3日 上午11:01:37
 */
public class Test_ZML {
	public static void main(String[] args) {
		byte a=1;
		short b=2;
		int c=3;
		long d=4;
		char e=5;
		float f=6;
		double g=7.0;
		//定义时需要注意的是byte、short、char只能初始化为int类型的常量
		//float初始化为整数时不用加f，但初始化为小数时必须加f
		//long类型存int范围内的整数不需要加L，超过int且在long范围内必须加L
		//byte aa=c;报错
		//short bb=c;报错
		//char ee=c;报错
		long dd=c;//可以直接赋值int类型的变量给long
	}

}
