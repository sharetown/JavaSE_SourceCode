package cn.tedu.array;
/**
 * ����ArraysAPI
 */
import java.util.Arrays;
import java.util.Random;

import javax.xml.crypto.Data;

public class Test_Array {
	public static void main(String[] args) {
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100) + 1;
		}
		Arrays.sort(arr);//Arrays.sort()�����ײ����ÿ��������㷨ʵ�ֵ�
		System.out.println(Arrays.toString(arr));

	}
}
