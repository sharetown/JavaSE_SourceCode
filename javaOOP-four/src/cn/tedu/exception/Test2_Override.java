package cn.tedu.exception;
/**
 * 测试方法重写
 * @author sharetown
 * @date 2020 2020年8月11日 下午2:13:55
 */
public class Test2_Override {
	public static void main(String[] args) {
		
	}
}
class Fu1{
	void show() {
		System.out.println("fulei");
	}
	
}
class Zi1 extends Fu1{
	@Override
	protected void show() {//重写的子类权限修饰符要大于等于子类的权限修饰符。
		// TODO Auto-generated method stub
		super.show();
		System.out.println("zilei");
	}
	
}