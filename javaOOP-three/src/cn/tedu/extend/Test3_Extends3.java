package cn.tedu.extend;

public class Test3_Extends3 {
	public static void main(String[] args) {
		new Zi3();
		new Zi3(1);
	}
}
class Fu3{
//	public Fu3() {
//		System.out.println("������޲ι�����");
//	}
	public Fu3(int a) {
		System.out.println("����ĺ��ι�����");
	}
	
}
class Zi3 extends Fu3{
	public Zi3() {
		super(1);
		System.out.println("������޲ι�����");
	}
	public Zi3(int a) {
		super(1);
		//������Ĺ������У�Ĭ�Ͼͻ����super()�������ø�����޲ι�����
		System.out.println("����ĺ��ι�����");
	}
}