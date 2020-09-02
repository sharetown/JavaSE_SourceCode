package cn.tedu.oop;
/**
 * 构造方法完成对象的初始化
 * @author sharetown
 * @date 2020 2020年8月8日 上午11:33:16
 */
public class Test2_CSH {
	public static void main(String[] args) {
		Student2 s=new Student2("王涛", 22);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.toString());
	}
}
class Student2{
	private String name;
	private int age;
	{
		System.out.println("构造代码块————优先于构造器执行");
	}
	public Student2(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("构造器——执行构造代码块后再执行");
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+":"+this.age;
	}
	
	
}