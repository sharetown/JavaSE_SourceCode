package cn.tedu.array;

import java.util.Arrays;
import java.util.Random;

/**
 * ���Դ�������
 * �����������
 * @author sharetown
 * @date 2020 2020��8��5�� ����4:01:12
 */
public class Test6_Array {

	public static void main(String[] args) {
		int[] randomArr=new int[10];
		for(int i=0;i<randomArr.length;i++) {
			randomArr[i]=new Random().nextInt(100)+1;
		}
		System.out.println(Arrays.toString(randomArr));
	}
	
}
