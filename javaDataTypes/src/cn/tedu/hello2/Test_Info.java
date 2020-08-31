package cn.tedu.hello2;

public class Test_Info {
	public static void main(String[] args) {
		//字符串的动态拼接
		System.out.println("大家好我叫渣渣辉");
		String name = "渣渣辉";
		System.out.println("大家好我叫"+name);//右拼接
		System.out.println();
		System.out.println("渣渣辉你好");
		System.out.println(name+"你好");//左拼接
		System.out.println();
		System.out.println("谁是渣渣辉的好朋友");
		System.out.println("谁是"+name+"的好朋友");//中间拼接
	}

}
