package cn.tedu.extend;
/**
 * ���� final�ؼ���
 * 1��final���ε����������࣬���ܱ��̳�
 * 2��final���εı����ǳ���
 * 3��final���εķ������ܱ���д
 * @author sharetown
 * @date 2020 2020��8��10�� ����3:56:33
 */
public class Test6_Final {

}
class A{
	final int a=5;
	//final public void m1(){
//		a=2;//final���εı����ǳ���
//	}
}
final class B extends A{
//	public void m1() {//final���εķ������ܱ���д
//	}
}
//class C extends B{//final���ε����������࣬���ܱ��̳�
	
//}