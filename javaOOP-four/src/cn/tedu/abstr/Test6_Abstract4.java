package cn.tedu.abstr;
/**
 * 测试成员方法
 * @author sharetown
 * @date 2020 2020年8月11日 下午4:29:08
 */
public class Test6_Abstract4 {
	public static void main(String[] args) {
		Demo d=new DemoZi();
		d.show();
		d.m1();
		d.m2();
	}

}
abstract class Demo{
	abstract public void m1();
	abstract public void m2();
	public void show(){
		System.out.println("Demo--show()");
	}
}
class DemoZi extends Demo{

	@Override
	public void m1() {
		System.out.println("DemoZi--m1()");
	}

	@Override
	public void m2() {
		System.out.println("DemoZi--m2()");
	}
	
}