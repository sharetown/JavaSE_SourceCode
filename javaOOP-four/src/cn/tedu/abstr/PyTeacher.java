package cn.tedu.abstr;

public class PyTeacher extends Teacher {

	@Override
	public void beiKe() {
		System.out.println(this.getName()+"��ʦ�ڸ�"+this.getKechen()+"�౸��");
		
	}

	@Override
	public void jiangKe() {
		System.out.println(this.getName()+"��ʦ�ڸ�"+this.getKechen()+"�ི��");
		
	}

}
