package cn.tedu.abstr;

public class GsTeacher extends Teacher {
	public String kechen;

	@Override
	public void beiKe() {
		System.out.println(this.getName()+"��ʦ�ڸ�"+this.getKechen()+"�౸��");
		
	}

	@Override
	public void jiangKe() {
		System.out.println(this.getName()+"��ʦ�ڸ�"+this.getKechen()+"�ི��");
		
	}

}
