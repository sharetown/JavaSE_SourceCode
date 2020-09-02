package cn.tedu.oop;
/**
 * 测试构造方法
 * @author sharetown
 * @date 2020 2020年8月8日 上午10:35:06
 */
public class Test_Constructor {
	public static void main(String[] args) {
		Student s=new Student();
//		Student s1=new Student(1);
	}
	
}
class Student{
	public Student() {
		System.out.println("我是无参构造器");
		System.out.println("如果定义了有参构造器还需要调用无参构造器时，必须显式声明无参构造器");
	}
	public Student(int a) {
		System.out.println("我是有参构造器");
	}
	
}
