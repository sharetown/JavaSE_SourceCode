package cn.tedu.array;

import java.util.Arrays;
import java.util.Random;

/**
 * 测试创建数组
 * 创建随机数组
 * @author sharetown
 * @date 2020 2020年8月5日 下午4:01:12
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
