package cn.tedu.abstr;

public class Test {
	public static void main(String[] args) {
		Teacher py=new PyTeacher();
		Teacher gs=new GsTeacher();
		GsTeacher g=new GsTeacher();
		py.setKechen("����");
		py.setName("�Ծ���");
		py.setAge(30);
		py.beiKe();
		py.jiangKe();
		gs.setKechen("����");
		gs.setName("С��������");
		gs.setAge(31);
		gs.beiKe();
		gs.jiangKe();
		System.out.println(g.kechen);
		
	}

}
