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
	//��ͨ��Դ
	String name;
	public void study() {
		System.out.println("ѧϰ");
		age=0;//��ͨ��������������
	}
	//��̬��Դ
	static int age=0;
	public static void play() {
		System.out.println("��ɻ�");
		age=1;
//		name="";//��̬������ֻ�ܵ��þ�̬��Դ
	}
}
