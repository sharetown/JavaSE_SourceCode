package cn.tedu.hello;

import java.util.Scanner;

/**
 * 自加赋值
 * @author sharetown
 * @date 2020年8月3日 上午11:01:47
 */
public class Zjfz {
	public static void main(String[] args) {
		byte a=1;
		//在这种情况下a+=4和a=a+4是有区别的。
		a+=4;
		//a=a+4;//会报错，因为这样赋值会发生数据类型的自动转换。
	
		int b=1;
		b+=4;
		b=b+4;//这里不报错是因为b的类型本身就是int类型，不用转换。
		
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
