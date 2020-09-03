package cn.tedu.extend;
/**
 * 继承里成员变量的使用
 * @author sharetown
 * @date 2020 2020年8月10日 上午10:14:04
 */
public class Test1_Extends {
	public static void main(String[] args) {
		new Zi().m1();
		new Zi().m2();
	}
	
	
}
class Fu{
	int sum=30;
	int count=10;
	public void m1() {
		System.out.println("父类m1");
	}
	public void m2() {
		System.out.println("父类m2");
	}
}
class Zi extends Fu{
	public String name;
	public int age;
	public void show() {
		super.count=1;
		System.out.println(super.count);
		//super关键字相当于父类对象的引用
	}
	@Override
	public void m1() {
		System.out.println("子类m1");
	}
	@Override
	public void m2() {//重写要求子类和父类的方法声明必须一样。
		//重写的方法修饰符不能更改
		super.m2();
		System.out.println("子类m2");
	}
}
