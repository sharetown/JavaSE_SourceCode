package cn.tedu.oop;
/**
 * ���Թ��췽��
 * @author sharetown
 * @date 2020 2020��8��8�� ����10:35:06
 */
public class Test_Constructor {
	public static void main(String[] args) {
		Student s=new Student();
//		Student s1=new Student(1);
	}
	
}
class Student{
	public Student() {
		System.out.println("�����޲ι�����");
		System.out.println("����������вι���������Ҫ�����޲ι�����ʱ��������ʽ�����޲ι�����");
	}
	public Student(int a) {
		System.out.println("�����вι�����");
	}
	
}
