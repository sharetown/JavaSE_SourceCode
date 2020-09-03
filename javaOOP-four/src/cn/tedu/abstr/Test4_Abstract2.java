package cn.tedu.abstr;

/**
 * 测试抽象类中的构造方法的使用
 * 
 * @author sharetown
 * @date 2020 2020年8月11日 下午3:48:24
 */
public class Test4_Abstract2 {
	public static void main(String[] args) {
		Animal a=new Dog();
	}
}

abstract class Animal {
	public Animal() {
		System.out.println("Animal无参构造");
	}

	public Animal(int a) {
		System.out.println("含参构造");
	}
}
class Dog extends Animal{
	public Dog() {
		System.out.println("Dog无参构造");
		//结果：
		//Animal无参构造
		//Dog无参构造
		//原因：子类的构造器会在第一行有一个隐藏的super()。默认调用父类的无参构造器
	}
}


