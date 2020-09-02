package cn.tedu.oop;
/**
 * 测试代码块
 * @author sharetown
 * @date 2020 2020年8月8日 下午2:10:00
 */
public class Test3_Block {
	public static void main(String[] args) {
		Person p=new Person();
		Person p1=new Person("WangTao");
		p1.m1();
		
	}

}
//创建Person类
class Person{
	{
		System.out.print("欢迎");
	}
	//构造代码块：触发节点：new
	//先执行构造代码块，再执行构造方法
	//作用：抽取构造方法的共性
	public Person() {
		System.out.println("无参构造");
	}
	public Person(String name) {
		System.out.println("含参构造"+name);
		
	}
	//局部代码块：出发节点：当方法调用的时候
	//局部代码块，在方法内，按顺序执行。
	//作用：控制变量的作用范围，出了局部代码块就不可以用了
	public void m1() {
		System.out.println("m1");
		{
			System.out.println("局部代码块");
		}
		System.out.println("m2");
	}
}