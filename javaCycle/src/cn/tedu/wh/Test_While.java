package cn.tedu.wh;

import java.util.Random;
import java.util.Scanner;

/**
 * 测试While循环
 * @author sharetown
 * @date 2020 2020年8月4日 下午4:13:50
 */
public class Test_While {
	public static void main(String[] args) {
		int random=new Random().nextInt(100);
		while(true) {
			System.out.println("请输入一个数：");
			int input=new Scanner(System.in).nextInt();
			if(input>random) {
				System.out.println("猜大了");
			}else if (input<random) {
				System.out.println("猜小了");
			}else {
				System.out.println("猜中了");
				break;
			}
		}
//		for(int i=0;i>=0;i++) {//死循环
//			System.out.println(1);
//		}
		int[] arr=new int[] {6431};
	}
	


}
