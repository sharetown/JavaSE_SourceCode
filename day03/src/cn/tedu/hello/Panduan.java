package cn.tedu.hello;
/**
 * 用三目运算符判断三个数中的最大值
 * @author sharetown
 * @date 2020年8月3日 上午11:01:25
 */
public class Panduan {
	public static void main(String[] args) {
		int a=5;
		int b=3;
		int c=8;
		System.out.println(c>((a>b)?a:b)?c:(a>b)?a:b);
	}

}
