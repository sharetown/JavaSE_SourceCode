package cn.tedu.inter;
/**
 * ����ӿ�
 * �ӿڵ�����������class
 * @author sharetown
 * @date 2020 2020��8��12�� ����10:22:27
 */
public class Test1_Interface {
	
	public static void main(String[] args) {
		Demo d=new D();
		d.show();
		d.eat();
	}
	
}
interface Demo{
	public final int AGE=10;
	abstract public void show();
	abstract public void eat();
}
class D implements Demo{

	@Override
	public void show() {
		System.out.println("show");
		
	}

	@Override
	public void eat() {
		System.out.println("eat");
		
	}
	
}


