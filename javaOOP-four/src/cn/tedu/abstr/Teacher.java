package cn.tedu.abstr;

public abstract class Teacher {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKechen() {
		return kechen;
	}
	public void setKechen(String kechen) {
		this.kechen = kechen;
	}
	private int age;
	public String kechen;
	public abstract void beiKe();
	public abstract void jiangKe();
}
