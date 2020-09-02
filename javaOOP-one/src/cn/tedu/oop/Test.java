package cn.tedu.oop;

public class Test {
	public static void main(String[] args) {
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
		new Phone();
	}

}

class Phone{
	String color;
	double size;
	String pinpai;
	int price;
	
	public void call() {
		System.out.println("打电话");
	}
	public void message() {
		System.out.println("发短信");
	}
	public void music() {
		System.out.println("听音乐");
	}
}











