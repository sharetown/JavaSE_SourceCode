package cn.tedu.oop;

public class Test_This2 {
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		Demo2 d2=new Demo2("");
	}

}
class Demo2{
	public Demo2() {
//		this("");
		System.out.println("�޲ι�����");
	}
	public Demo2(String name) {
		this();
		System.out.println("���ι�����");
		
	}
}
