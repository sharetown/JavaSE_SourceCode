package cn.tedu.extend;

public class Test5_Block {
	public static void main(String[] args) {
		new StaticDemo().show();
		System.out.println("-------------------");
		new StaticDemo().show();
	}

}
class StaticDemo{
	//��������
	{
		System.out.println("��������");
	}
	//���췽��
	public StaticDemo() {
		System.out.println("�޲ι��췽��");
	}
	//�ֲ������
	public void show() {
		{
			System.out.println("�ֲ������");
		}
	}
	//��̬�����
	static{
		System.out.println("��̬�����");
	}
}
