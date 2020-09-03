package cn.tedu.extend;
/**
 * 多态的前提是继承
 * 要有方法的重写
 * 
 * 口诀1：父类引用指向子类对象
 * 口诀2：编译看左边，运行看右边
 * 
 * @author sharetown
 * @date 2020 2020年8月10日 下午4:55:13
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
		//a.sleep();//调用左边（父类）没有的方法编译时报错。
		System.out.println(a.num);
		
		
		
	}
}
class Animal{
	int num=1;
	static String name="1";
	public void eat() {
		System.out.println("啥都吃");
	}
	public void play() {
		System.out.println("dafeij");
	}
	
}
class Dog extends Animal{
	int num=2;
	static String name="2";
	public void eat() {
		System.out.println("吃屎");
	}
	public void sleep() {
		System.out.println("sleep()--");
	}
	
	
}