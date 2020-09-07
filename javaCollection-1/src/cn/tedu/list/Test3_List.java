package cn.tedu.list;

import java.util.*;

/**
 * 测试List接口
 * @author sharetown
 * @date 2020/8/18 15:54
 */
public class Test3_List {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        //List接口的特点：有序+可重复+null+索引
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(21);
        list.add(21);
        list.add(null);
        System.out.println(list);
        //2、调用方法
        list.add(1,20);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        System.out.println(list.indexOf(21));
        System.out.println(list.lastIndexOf(21));
        System.out.println(list.set(0,1));//返回替换指定下标的元素
        System.out.println(list);
        System.out.println(list.subList(0,5));//返回截取子集合，含头不含尾
//        list.add(3);
//        list.add(5);
//        System.out.println(list);
//        System.out.println(list.contains(2));
//        System.out.println(list.equals(1357));
//        System.out.println(list.hashCode());
//        System.out.println(list.isEmpty());
//        System.out.println(list.remove(0));
//        System.out.println(list.remove(new Integer(5)));
//        System.out.println(list.size());
//        System.out.println(Arrays.toString(list.toArray()));

        //迭代List集合
        //Iterator<E> iterator
//        ListIterator<E> listIterator——相比于父接口，可以向后遍历，也可以逆向遍历
        //方式1
        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //方式2
        ListIterator<Integer> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //逆向遍历——必须先顺序遍历后才能进行逆向遍历
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        //方式3
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        //方式4
        for (Integer i:list) {
            System.out.println(i);
        }

    }
}
