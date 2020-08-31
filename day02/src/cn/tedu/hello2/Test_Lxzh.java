package cn.tedu.hello2;
//类型转换
public class Test_Lxzh {
	public static void main(String[] args) {
		//小类型转大类型：直接转
		byte a = 10;
		long b = a;//直接转
		
		//大类型转小类型：强制转换
		double c = 9.9;
		float d = (float)c;//强制转
	}
}
