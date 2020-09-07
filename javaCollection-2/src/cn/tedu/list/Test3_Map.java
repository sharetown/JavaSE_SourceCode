package cn.tedu.list;

import java.util.*;

/**
 * @author sharetown
 * @date 2020/8/19 15:27
 */
public class Test3_Map {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(9527,"唐伯虎");
        map.put(9528,"如花");
        map.put(9529,"秋香");
        map.put(9530,"石榴姐");
        System.out.println(map.get(9527));
        //System.out.println(map.keySet());
        System.out.println(map.size());
        System.out.println(map.remove(9528));
        System.out.println(map.values());
        System.out.println(map.containsKey(9528));
        System.out.println(map.containsValue("石榴姐"));
        System.out.println(map.replace(9527,"彭松"));
        System.out.println(map);

        Map<Integer,String> map1=new HashMap<>();
        map1.put(1234,"王涛");
        map1.put(1235,"周小伟");
        map1.put(1236,"田文文");
        map.putAll(map1);
        System.out.println(map);

        Set<Integer> keySet=map.keySet();
        //遍历keySet方式一
        Iterator it=keySet.iterator();
        while (it.hasNext()){
            System.out.println(map.get(it.next()));
        }
        //遍历keySet方式二
        for (Integer i:keySet
             ) {
            System.out.println(map.get(i));

        }
        //遍历map方式三
        Collection<String> valueList= map.values();
        for (String s:valueList) {
            System.out.println(s);
        }

        //遍历map方式四
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        //4.1
        for (Map.Entry entry:set
             ) {
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
        //4.2
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
