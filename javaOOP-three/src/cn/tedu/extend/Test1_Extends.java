package cn.tedu.extend;
/**
 * �̳����Ա������ʹ��
 * @author sharetown
 * @date 2020 2020��8��10�� ����10:14:04
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
		System.out.println("����m1");
	}
	public void m2() {
		System.out.println("����m2");
	}
}
class Zi extends Fu{
	public String name;
	public int age;
	public void show() {
		super.count=1;
		System.out.println(super.count);
		//super�ؼ����൱�ڸ�����������
	}
	@Override
	public void m1() {
		System.out.println("����m1");
	}
	@Override
	public void m2() {//��дҪ������͸���ķ�����������һ����
		//��д�ķ������η����ܸ���
		super.m2();
		System.out.println("����m2");
	}
}
