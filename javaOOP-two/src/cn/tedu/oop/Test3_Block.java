package cn.tedu.oop;
/**
 * ���Դ����
 * @author sharetown
 * @date 2020 2020��8��8�� ����2:10:00
 */
public class Test3_Block {
	public static void main(String[] args) {
		Person p=new Person();
		Person p1=new Person("WangTao");
		p1.m1();
		
	}

}
//����Person��
class Person{
	{
		System.out.print("��ӭ");
	}
	//�������飺�����ڵ㣺new
	//��ִ�й������飬��ִ�й��췽��
	//���ã���ȡ���췽���Ĺ���
	public Person() {
		System.out.println("�޲ι���");
	}
	public Person(String name) {
		System.out.println("���ι���"+name);
		
	}
	//�ֲ�����飺�����ڵ㣺���������õ�ʱ��
	//�ֲ�����飬�ڷ����ڣ���˳��ִ�С�
	//���ã����Ʊ��������÷�Χ�����˾ֲ������Ͳ���������
	public void m1() {
		System.out.println("m1");
		{
			System.out.println("�ֲ������");
		}
		System.out.println("m2");
	}
}