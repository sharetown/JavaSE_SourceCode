package cn.tedu.oop;
/**
 * ���췽����ɶ���ĳ�ʼ��
 * @author sharetown
 * @date 2020 2020��8��8�� ����11:33:16
 */
public class Test2_CSH {
	public static void main(String[] args) {
		Student2 s=new Student2("����", 22);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.toString());
	}
}
class Student2{
	private String name;
	private int age;
	{
		System.out.println("�������顪�����������ڹ�����ִ��");
	}
	public Student2(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("����������ִ�й����������ִ��");
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