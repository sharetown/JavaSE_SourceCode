package cn.tedu.hello;

import java.util.Scanner;

/**
 * ����������ֵ����
 * @author sharetown
 * @date 2020��8��3�� ����11:01:09
 */
public class ExChange {
	public static void main(String[] args) {
		//ʹ�õ�����ʱ������һ�㷽��
		System.out.println("����a");
		int a=new Scanner(System.in).nextInt();
		System.out.println("����b");
		int b=new Scanner(System.in).nextInt();
		System.out.println("����ǰ��a="+a+"��b="+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("������a="+a+"��b="+b);
		
		//��ʹ�õ�����ʱ��������򷽷�
		System.out.println("����x");
		int x=new Scanner(System.in).nextInt();
		System.out.println("����y");
		int y=new Scanner(System.in).nextInt();
		System.out.println("����ǰ��x="+x+"��y="+y);
		x=x^y;
		y=y^x;
		x=x^y;
		System.out.println("������x="+x+"��y="+y);
	}

}
