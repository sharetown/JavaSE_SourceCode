package cn.tedu.wh;

import org.junit.Test;

//测试 变量
public class Test6_Variable {
	// 在这里定义成员变量--位置在类里方法外
	double age;
	double money;
	//TODO 其他类型的默认值

	// 单元测试模块Junit
	// 要求，方法须被public修饰，没有返回值，没有参数列表。
	// 标志：@Test
	@Test
	public void m1() {
		int age = 18;
		System.out.println(age);//变量遵循就近原则
		System.out.println(money);
	}
}
