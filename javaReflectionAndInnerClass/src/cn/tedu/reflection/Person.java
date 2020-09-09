package cn.tedu.reflection;

import org.junit.Test;

/**
 * @author sharetown
 * @date 2020/8/24 16:03
 */
public class Person {
    private String name;
    private int age;
    private double score;

    public Person(){

    }

    private Person(String name) {
        this.name = name;
    }

    private Person(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    private void eat(){
        System.out.println("---eat()---");
    }

    private void sleep(){

    }

    private void game(){

    }
    @Test
    public void show(){
        System.out.println(123);
    }
}
