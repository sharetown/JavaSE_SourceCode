package cn.tedu.wh;

import java.util.Random;
import java.util.Scanner;

/**
 * ����Whileѭ��
 * @author sharetown
 * @date 2020 2020��8��4�� ����4:13:50
 */
public class Test_While {
	public static void main(String[] args) {
		int random=new Random().nextInt(100);
		while(true) {
			System.out.println("������һ������");
			int input=new Scanner(System.in).nextInt();
			if(input>random) {
				System.out.println("�´���");
			}else if (input<random) {
				System.out.println("��С��");
			}else {
				System.out.println("������");
				break;
			}
		}
//		for(int i=0;i>=0;i++) {//��ѭ��
//			System.out.println(1);
//		}
		int[] arr=new int[] {6431};
	}
	


}
