package cn.tedu.list;

import java.util.LinkedList;

/**
 * 测试LinkedList
 * @author sharetown
 * @date 2020/8/19 9:05
 */
public class Test1 {
    public static void main(String[] args) {
        //创建对象
        LinkedList<Integer> list=new LinkedList<>();
        //2、调用对象
        list.add(123);
        list.add(2);
        list.add(23);
        list.add(12);
        System.out.println(list);
        System.out.println(list.contains(0));
        System.out.println(list.equals(123));
        System.out.println(list.hashCode());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(new Integer(123)));
        System.out.println(list.size());
        //LinkedList的特有方法—针对首尾元素
        list.addFirst(0);
        list.addLast(99);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());

        //还有一套同样效果的方法
        list.offerFirst(1);
        list.offerLast(1);

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());


    }

}
