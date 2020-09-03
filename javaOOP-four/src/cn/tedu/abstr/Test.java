package cn.tedu.abstr;

public class Test {
	public static void main(String[] args) {
		Teacher py=new PyTeacher();
		Teacher gs=new GsTeacher();
		GsTeacher g=new GsTeacher();
		py.setKechen("培优");
		py.setName("苍井空");
		py.setAge(30);
		py.beiKe();
		py.jiangKe();
		gs.setKechen("高手");
		gs.setName("小泽·玛丽亚");
		gs.setAge(31);
		gs.beiKe();
		gs.jiangKe();
		System.out.println(g.kechen);
		
	}

}
