package cn.tedu.exception;
/**
 * ���Է�����д
 * @author sharetown
 * @date 2020 2020��8��11�� ����2:13:55
 */
public class Test2_Override {
	public static void main(String[] args) {
		
	}
}
class Fu1{
	void show() {
		System.out.println("fulei");
	}
	
}
class Zi1 extends Fu1{
	@Override
	protected void show() {//��д������Ȩ�����η�Ҫ���ڵ��������Ȩ�����η���
		// TODO Auto-generated method stub
		super.show();
		System.out.println("zilei");
	}
	
}