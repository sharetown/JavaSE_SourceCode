package cn.tedu.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 测试Set,HashSet实现类
 * @author sharetown
 * @date 2020/8/19 14:04
 */
public class Test2_Set {
    public static void main(String[] args) {
        //1、创建对象
        Set<Integer> set=new HashSet<>();
        //2、调用方法
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        System.out.println(set.contains(2));
        System.out.println(set.equals(12345));
        System.out.println(set.hashCode());
        System.out.println(set.remove(3));
        System.out.println(Arrays.toString(set.toArray()));

        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        //System.out.println(set.retainAll(set1));//交
//        System.out.println(set.removeAll(set1));//差
//        System.out.println(set.containsAll(set1));
        System.out.println(set);

        //Set的遍历
        //方式一
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
