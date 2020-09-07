package cn.tedu.list;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 测试 泛型 检查数据类型
 * @author sharetown
 * @date 2020/8/18 11:15
 */
public class Test1_Fanxing {
    public static void main(String[] args) {
        //1、回顾数组
//        int a[]={1,2,3,4,5,6.5,"dsad"};//自动检查数据类型，会在编译时就检查数据类型
        //2、泛型——通常配合集合使用，标志<>
        //如果不用泛型，集合中可以添加的元素类型非常丰富
        Collection c=new ArrayList();
        c.add(1);
        c.add(2.4);
        c.add(true);
        c.add(new File(""));
        c.add("str");
        System.out.println(c);

        //3、开始使用泛型
        Collection<Integer> i=new ArrayList<>();
        i.add(123);
//        i.add(1.2);
//        i.add("dsad");
        test_FX();

    }

    /**
     * 测试泛型的通用性
     */
    public static void test_FX(){
        Integer[] a={1,2,3,4,5};
        print(a);
        Double[] b={1.1,1.1,2.2,3.3};
        print(b);
    }
    public static void print(Object[] a){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    //使用泛型
    public static <T> void p(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
