package cn.tedu.abstr;
/**
 * ���Գ�����ĳ�Ա����
 * @author sharetown
 * @date 2020 2020��8��11�� ����4:00:23
 */
public class Test5_Abstract3 {
	public static void main(String[] args) {
		Old a=new Yung();
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.number);
	}
	

}
abstract class Old{
	String name;
	int age;
	final int number=1;
	
}
class Yung extends Old{
	
}