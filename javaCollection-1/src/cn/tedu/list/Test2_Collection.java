package cn.tedu.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 测试Collection的功能
 * @author sharetown
 * @date 2020/8/18 14:50
 */
public class Test2_Collection {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println(c.add(4));//添加元素
        System.out.println(c);
        System.out.println(c.contains(2));//判断元素是否在集合中
        System.out.println(c.equals("1234"));//判断值是否相等
        System.out.println(c.hashCode());//返回集合的hash值
        System.out.println(c.isEmpty());//是否为空
        System.out.println(c.remove(3));//删除值为3的数
        System.out.println(c.size());//集合的元素个数
        System.out.println(Arrays.toString(c.toArray()));//转成数组
        //c.clear();//清空

        //集合间的操作
        Collection<Integer> c2=new ArrayList<>();
        c2.add(1);
        c2.add(3);
        System.out.println(c.addAll(c2));//把c2加到c里去
        System.out.println(c);//
        System.out.println(c.containsAll(c2));//判断c里是否含有c2
        System.out.println(c);
        System.out.println(c.removeAll(c2));//移除掉c和c2里都有的——取差集
        System.out.println(c);
        //System.out.println(c.retainAll(c2));//取交集
        //System.out.println(c);

        //迭代器 Iterator<E> iterator
        Iterator<Integer> it=c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
