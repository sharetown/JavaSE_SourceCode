package cn.tedu.hello2;

import java.util.Scanner;

public class Test_Area {
	public static void main(String[] args) {
		//1������뾶�ı���
		double r = 5.5;
		//����Scanner��ӿ���̨��������
		r = new Scanner(System.in).nextDouble();
		//2�����������¼���
		double area = 3.14*r*r;
		System.out.println(area);
		
		//3��Բ���ܳ�
		double c = 2*3.14*r;
		System.out.println(c);
	}

}
