package cn.tedu.extend;
/**
 * ��̬��ǰ���Ǽ̳�
 * Ҫ�з�������д
 * 
 * �ھ�1����������ָ���������
 * �ھ�2�����뿴��ߣ����п��ұ�
 * 
 * @author sharetown
 * @date 2020 2020��8��10�� ����4:55:13
 */
public class Test7_DuoTai {
	public static void main(String[] args) {
		Animal a=new Dog();
		System.out.println(a.name+="1");
		Animal b=new Dog();
		System.out.println(b.name+="2");
		Animal c=new Dog();
		System.out.println(c.name+="3");
		System.out.println(a.name);
		a.eat();
		a.play();
		//a.sleep();//������ߣ����ࣩû�еķ�������ʱ����
		System.out.println(a.num);
		
		
		
	}
}
class Animal{
	int num=1;
	static String name="1";
	public void eat() {
		System.out.println("ɶ����");
	}
	public void play() {
		System.out.println("dafeij");
	}
	
}
class Dog extends Animal{
	int num=2;
	static String name="2";
	public void eat() {
		System.out.println("��ʺ");
	}
	public void sleep() {
		System.out.println("sleep()--");
	}
	
	
}