package cn.tedu.extend;

public class Test3_Extends3 {
	public static void main(String[] args) {
		new Zi3();
		new Zi3(1);
	}
}
class Fu3{
//	public Fu3() {
//		System.out.println("父类的无参构造器");
//	}
	public Fu3(int a) {
		System.out.println("父类的含参构造器");
	}
	
}
class Zi3 extends Fu3{
	public Zi3() {
		super(1);
		System.out.println("子类的无参构造器");
	}
	public Zi3(int a) {
		super(1);
		//在子类的构造器中，默认就会存在super()——调用父类的无参构造器
		System.out.println("子类的含参构造器");
	}
}