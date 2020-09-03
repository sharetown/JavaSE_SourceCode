package cn.tedu.inter;
/**
 * 测试接口的复杂用法
 * @author sharetown
 * @date 2020 2020年8月12日 下午2:15:28
 */
public class Test3_Inter {
	public static void main(String[] args) {
		Inter3 t=new Imp2();
		t.m1();
		t.m2();
		t.m3();
		System.out.println("---------");
		new InterImp().m1();
	}

}
//接口间的多继承
interface Inter1{
	void m1();
	void m2();
}
interface Inter2 extends Inter1{
	void m3();
	
}
interface Inter3 extends Inter2,Inter1{
	
}
//接口多实现（实现类和接口）
class Imp2 implements Inter2,Inter3{

	@Override
	public void m1() {
		System.out.println("m1()--");
		
	}

	@Override
	public void m2() {
		System.out.println("m2()--");
		
	}

	@Override
	public void m3() {
		System.out.println("m3()--");
		
	}
	
}
class Imp3{
	
}

//继承时实现
class InterImp extends Imp3 implements Inter1,Inter2{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	
}
