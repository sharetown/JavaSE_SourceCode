package cn.tedu.extend;
/**
 * �̳к󣬳�Ա�����������仯�ġ�
 * @author sharetown
 * @date 2020 2020��8��12�� ����9:23:12
 */
public class Test_Extends4 {
	public static void main(String[] args) {
		Zi4 z1=new Zi4();
		Zi5 z2=new Zi5();
		System.out.println(z1.num);//20
		System.out.println(z2.num);//10
		
		Fu4 f1=new Zi4();
		Fu4 f2=new Zi5();
		System.out.println(f1.num);//10���ѵ���Ӧ����20��
		System.out.println(f2.num);//10
		
		/**
		 * �ܽ᣺
		 * 1�����ڽ���Ǹ��� ��Ա���� �������� ��Ա���� ֻ����������������й�
		 * 2�����ڽ���Ǹ��� ��Ա���� �������� ��Ա���� �������ʵ�������ͺ��Ƿ�����д�йء�
		 */
	}
}
class Fu4{
	int num=10;	
}
class Zi4 extends Fu4{
	int num=20;	
}
class Zi5 extends Fu4{	
}