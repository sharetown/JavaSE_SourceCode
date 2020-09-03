package cn.tedu.extend;
/**
 * 继承后，成员变量是怎样变化的。
 * @author sharetown
 * @date 2020 2020年8月12日 上午9:23:12
 */
public class Test_Extends4 {
	public static void main(String[] args) {
		Zi4 z1=new Zi4();
		Zi5 z2=new Zi5();
		System.out.println(z1.num);//20
		System.out.println(z2.num);//10
		
		Fu4 f1=new Zi4();
		Fu4 f2=new Zi5();
		System.out.println(f1.num);//10？难道不应该是20？
		System.out.println(f2.num);//10
		
		/**
		 * 总结：
		 * 1、对于结果是父类 成员变量 还是子类 成员变量 只与变量的声明类型有关
		 * 2、对于结果是父类 成员方法 还是子类 成员方法 与变量的实例化类型和是否发生重写有关。
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