package cn.tedu.abstr;

/**
 * ���Գ������еĹ��췽����ʹ��
 * 
 * @author sharetown
 * @date 2020 2020��8��11�� ����3:48:24
 */
public class Test4_Abstract2 {
	public static void main(String[] args) {
		Animal a=new Dog();
	}
}

abstract class Animal {
	public Animal() {
		System.out.println("Animal�޲ι���");
	}

	public Animal(int a) {
		System.out.println("���ι���");
	}
}
class Dog extends Animal{
	public Dog() {
		System.out.println("Dog�޲ι���");
		//�����
		//Animal�޲ι���
		//Dog�޲ι���
		//ԭ������Ĺ��������ڵ�һ����һ�����ص�super()��Ĭ�ϵ��ø�����޲ι�����
	}
}


