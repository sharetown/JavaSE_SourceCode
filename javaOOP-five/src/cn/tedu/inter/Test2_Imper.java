package cn.tedu.inter;
/**
 * ���� �ӿڹ��췽��
 * "interface cannot have constructors"
 * @author sharetown
 * @date 2020 2020��8��12�� ����11:26:39
 */
public class Test2_Imper implements Demo2{
	public static void main(String[] args) {
		System.out.println(Demo2.age);//�ӿ���ı������Ǿ�̬��
	}

}
interface Demo1{
	public Demo1(){
		
	}
}
/**
 * ���Խӿ���ĳ�Ա����
 * �ӿ���ĳ�Ա���������ʼ��
 * @author sharetown
 * @date 2020 2020��8��12�� ����11:29:55
 */
interface Demo2{
	int age=20;
	//�ӿ���ı���Ĭ�϶�����ǰ׺��public static final
}
/**
 * ���Խӿ������ͨ����
 * Java1.8�Ժ󣬽ӿ�����Դ�����ͨ���������ӿ������ͨ��������ʹ��Ĭ�ϵ�Ȩ�����η�
 * �������γɾ�̬��static��
 * @author sharetown
 * @date 2020 2020��8��12�� ����11:39:47
 */
interface Demo3{
	public default void show() {
		System.out.println("Java1.8�Ժ��������");
	}
	public static void eat() {
		System.out.println("Java1.8�Ժ��������");
	}
	default void get() {
		
	}
	
	
}

