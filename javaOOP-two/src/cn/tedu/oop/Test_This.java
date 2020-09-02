package cn.tedu.oop;
/**
 * 测试This关键字
 * @author sharetown
 * @date 2020 2020年8月8日 下午2:55:09
 */
public class Test_This {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
	}
}
class Demo{
	String name;//成员变量
	int count=20;//成员变量
	public Demo() {
		
	}
	public Demo(String name) {
		
	}
	public void m1() {
		System.out.println(count);//20
		int count=10;//局部变量
		System.out.println(count);//10。因为就近原则
		Demo d=new Demo();
		System.out.println(d.count);//20
		System.out.println(this.count);//20。因为this关键字
		System.out.println(name);
	}
}
