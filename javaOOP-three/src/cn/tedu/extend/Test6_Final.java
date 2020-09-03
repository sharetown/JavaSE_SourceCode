package cn.tedu.extend;
/**
 * 测试 final关键字
 * 1、final修饰的类是最终类，不能被继承
 * 2、final修饰的变量是常量
 * 3、final修饰的方法不能被重写
 * @author sharetown
 * @date 2020 2020年8月10日 下午3:56:33
 */
public class Test6_Final {

}
class A{
	final int a=5;
	//final public void m1(){
//		a=2;//final修饰的变量是常量
//	}
}
final class B extends A{
//	public void m1() {//final修饰的方法不能被重写
//	}
}
//class C extends B{//final修饰的类是最终类，不能被继承
	
//}