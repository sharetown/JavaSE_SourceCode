package cn.tedu.oop;

/**
 * 测试private
 * 
 * @author sharetown
 * @date 2020 2020年8月7日 下午5:02:03
 */
public class Test4 {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.getNumber());
	}
}

class Student {
	// 特征
	private String number="40088208820DHC";
	private String name="彭松";
	private char gender='M';
	private int age=21;
	private String gradeNumber="CGB2007";
	private int classNumber=2;
	private int height=181;
	private int weight=130;
	

	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGradeNumber() {
		return gradeNumber;
	}


	public void setGradeNumber(String gradeNumber) {
		this.gradeNumber = gradeNumber;
	}


	public int getClassNumber() {
		return classNumber;
	}


	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	// 行为
	private void study() {
		System.out.println("学习");
	}
	
	
	

}
