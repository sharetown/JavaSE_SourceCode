package cn.tedu.api;

/**
 *
 */
public class Test2_Object {
    public static void main(String[] args) {
        Student s=new Student("小涛",18);
        System.out.println(s.hashCode());
        System.out.println(s.toString());
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.equals("");
        Student s1=new Student("jack",20);
        Student s2=new Student("jack",20);
        System.out.println(s1.equals(s2));

    }
}
