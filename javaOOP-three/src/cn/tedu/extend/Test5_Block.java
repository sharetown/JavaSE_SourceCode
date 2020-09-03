package cn.tedu.extend;

public class Test5_Block {
	public static void main(String[] args) {
		new StaticDemo().show();
		System.out.println("-------------------");
		new StaticDemo().show();
	}

}
class StaticDemo{
	//构造代码块
	{
		System.out.println("构造代码块");
	}
	//构造方法
	public StaticDemo() {
		System.out.println("无参构造方法");
	}
	//局部代码块
	public void show() {
		{
			System.out.println("局部代码块");
		}
	}
	//静态代码块
	static{
		System.out.println("静态代码块");
	}
}
