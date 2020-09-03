package cn.tedu.extend;

public class Test4_Static {
	public static void main(String[] args) {
//		Student.play();
//		System.out.println(Student.age);
//		System.out.println(new Student().name);
//		new Student().study();

		System.out.println(Student.age);
	}

}
class Student{
	//普通资源
	String name;
	public void study() {
		System.out.println("学习");
		age=0;//普通区域可以任意调用
	}
	//静态资源
	static int age=0;
	public static void play() {
		System.out.println("打飞机");
		age=1;
//		name="";//静态区域里只能调用静态资源
	}
}
