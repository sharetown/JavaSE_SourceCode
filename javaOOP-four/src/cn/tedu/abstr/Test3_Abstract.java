package cn.tedu.abstr;
/**
 * ���Գ�����
 * @author sharetown
 * @date 2020 2020��8��11�� ����2:38:58
 */
public class Test3_Abstract {

	public static void main(String[] args) {
		B b=new B();
		b.show();
		b.sleep();
	}
}
abstract class A{
	 public abstract void show();
	 public void sleep() {
		 System.out.println("dfdsf");
	 }
}
class B extends A{
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}