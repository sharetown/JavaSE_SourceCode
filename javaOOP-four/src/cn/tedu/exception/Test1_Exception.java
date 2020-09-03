package cn.tedu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1_Exception {
	public static void main(String[] args) {
		method();
		
	}
	public static void method() {
		try {
			int a=new Scanner(System.in).nextInt();
			int b=new Scanner(System.in).nextInt();
			System.out.println(a/b);
		}catch (InputMismatchException e) {
			System.out.println("您的数据输入类型有误");
		}catch (ArithmeticException e) {
			System.out.println("除零错误");
		}
	}

}
