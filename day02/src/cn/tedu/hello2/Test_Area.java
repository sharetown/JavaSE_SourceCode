package cn.tedu.hello2;

import java.util.Scanner;

public class Test_Area {
	public static void main(String[] args) {
		//1、定义半径的变量
		double r = 5.5;
		//利用Scanner类从控制台输入数据
		r = new Scanner(System.in).nextDouble();
		//2、定义变量记录面积
		double area = 3.14*r*r;
		System.out.println(area);
		
		//3、圆的周长
		double c = 2*3.14*r;
		System.out.println(c);
	}

}
