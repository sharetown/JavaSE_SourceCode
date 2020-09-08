package cn.tedu.thread;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author sharetown
 * @date 2020/8/22 17:02
 */
public class Test5_annotation {
    public static void main(String[] args) {

    }
}
//1、自定义注解:@interface 注解名
//@Target(ElementType.METHOD)//描述注解可以出现的位置
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})//描述注解可以出现的位置——多个位置上
@Retention(RetentionPolicy.SOURCE)//描述注解的生命周期
@interface MyAnnotation{
    String local() default "class";
    String value() default "";//特殊属性value
}
//2、使用注解：@MyAnnotation
@MyAnnotation
class Hello{
    @MyAnnotation(local = "field")
    String name;
    @MyAnnotation(local = "method")
    public void show(){

    }
}

