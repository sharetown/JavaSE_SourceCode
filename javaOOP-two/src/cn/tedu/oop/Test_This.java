package cn.tedu.oop;
/**
 * ����This�ؼ���
 * @author sharetown
 * @date 2020 2020��8��8�� ����2:55:09
 */
public class Test_This {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
	}
}
class Demo{
	String name;//��Ա����
	int count=20;//��Ա����
	public Demo() {
		
	}
	public Demo(String name) {
		
	}
	public void m1() {
		System.out.println(count);//20
		int count=10;//�ֲ�����
		System.out.println(count);//10����Ϊ�ͽ�ԭ��
		Demo d=new Demo();
		System.out.println(d.count);//20
		System.out.println(this.count);//20����Ϊthis�ؼ���
		System.out.println(name);
	}
}
