package cn.tedu.hello;

import java.util.Scanner;

/**
 * �ԼӸ�ֵ
 * @author sharetown
 * @date 2020��8��3�� ����11:01:47
 */
public class Zjfz {
	public static void main(String[] args) {
		byte a=1;
		//�����������a+=4��a=a+4��������ġ�
		a+=4;
		//a=a+4;//�ᱨ����Ϊ������ֵ�ᷢ���������͵��Զ�ת����
	
		int b=1;
		b+=4;
		b=b+4;//���ﲻ��������Ϊb�����ͱ������int���ͣ�����ת����
		
		int x=new Scanner(System.in).nextInt();
		int y=new Scanner(System.in).nextInt();
		int z=new Scanner(System.in).nextInt();
		System.out.println(z>(x>y?x:y)?z:(x>y?x:y));
		int max=x>y?x:y;
		max=z>max?z:max;
		System.out.println(max);
		
		max(z,max(x,y));	
	}
	public static int max(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	

}
