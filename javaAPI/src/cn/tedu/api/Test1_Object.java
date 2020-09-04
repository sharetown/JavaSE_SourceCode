package cn.tedu.api;

import java.util.Objects;

/**
 * 测试ObjectAPI
 */
public class Test1_Object {
    public static void main(String[] args) {
        Object o = new Object();
        int i = o.hashCode();//返回o对象在内存中的hash码值
        System.out.println(i);
        String s=o.toString();//返回参数的（o对象的地址）值转换为字符串
        System.out.println(s);//
        boolean flag=o.equals("jack");//判断两个对象的值是否相等。相等返回true，不等返回false
        System.out.println(flag);



    }

}
class Student{
    private String name;
    private int age;

    Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
