package cn.tedu.inter;
/**
 * ���Խӿڵĸ����÷�
 * @author sharetown
 * @date 2020 2020��8��12�� ����2:15:28
 */
public class Test3_Inter {
	public static void main(String[] args) {
		Inter3 t=new Imp2();
		t.m1();
		t.m2();
		t.m3();
		System.out.println("---------");
		new InterImp().m1();
	}

}
//�ӿڼ�Ķ�̳�
interface Inter1{
	void m1();
	void m2();
}
interface Inter2 extends Inter1{
	void m3();
	
}
interface Inter3 extends Inter2,Inter1{
	
}
//�ӿڶ�ʵ�֣�ʵ����ͽӿڣ�
class Imp2 implements Inter2,Inter3{

	@Override
	public void m1() {
		System.out.println("m1()--");
		
	}

	@Override
	public void m2() {
		System.out.println("m2()--");
		
	}

	@Override
	public void m3() {
		System.out.println("m3()--");
		
	}
	
}
class Imp3{
	
}

//�̳�ʱʵ��
class InterImp extends Imp3 implements Inter1,Inter2{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	
}
