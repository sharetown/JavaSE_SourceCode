package cn.tedu.abstr;

public class PyTeacher extends Teacher {

	@Override
	public void beiKe() {
		System.out.println(this.getName()+"老师在给"+this.getKechen()+"班备课");
		
	}

	@Override
	public void jiangKe() {
		System.out.println(this.getName()+"老师在给"+this.getKechen()+"班讲课");
		
	}

}
