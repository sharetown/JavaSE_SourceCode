package tu.tedu.method;
/**
 * 测试方法返回值
 * @author sharetown
 * @date 2020 2020年8月5日 上午11:58:01
 */
public class Test3_Method {
	public static void main(String[] args) {
		int sum=add(5,10);
		System.out.println(sum);
	}

	public static int add(int a,int b) {
		return a+b;
	}
}
