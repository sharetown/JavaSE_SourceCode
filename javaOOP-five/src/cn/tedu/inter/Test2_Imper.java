package cn.tedu.inter;
/**
 * 测试 接口构造方法
 * "interface cannot have constructors"
 * @author sharetown
 * @date 2020 2020年8月12日 上午11:26:39
 */
public class Test2_Imper implements Demo2{
	public static void main(String[] args) {
		System.out.println(Demo2.age);//接口里的变量都是静态的
	}

}
interface Demo1{
	public Demo1(){
		
	}
}
/**
 * 测试接口里的成员变量
 * 接口里的成员变量必须初始化
 * @author sharetown
 * @date 2020 2020年8月12日 上午11:29:55
 */
interface Demo2{
	int age=20;
	//接口里的变量默认都含有前缀：public static final
}
/**
 * 测试接口里的普通方法
 * Java1.8以后，接口里可以存在普通方法，但接口里的普通方法必须使用默认的权限修饰符
 * 或是修饰成静态的static类
 * @author sharetown
 * @date 2020 2020年8月12日 上午11:39:47
 */
interface Demo3{
	public default void show() {
		System.out.println("Java1.8以后的新特性");
	}
	public static void eat() {
		System.out.println("Java1.8以后的新特性");
	}
	default void get() {
		
	}
	
	
}

