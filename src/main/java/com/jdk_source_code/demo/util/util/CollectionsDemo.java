package com.jdk_source_code.demo.util.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author lilin
 * @date 2019-11-27
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ttt");
        list.add("rrr");
        list.add("aaa");
        list.add("ccc");
        list.add("nnn");
        list.add("ccc");
        Collections.sort(list);
        System.out.println(list);
        //排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.compareTo(o2)<0){
                    return 1;
                }
                return -1;
            }
        });
        System.out.println(list);
//        倒叙
        Collections.reverse(list);
        System.out.println(list);
        //随机排序
        Collections.shuffle(list);
        System.out.println(list);
        //交换i，j位置元素
        Collections.swap(list,1,2);
        System.out.println(list);

        //复制集合2到原有集合，覆盖复制
        List<String> list2 = new ArrayList<>();
        list2.add("ccc");
        Collections.copy(list,list2);
        System.out.println(list);

        //返回集合中的最小元素
        String min = Collections.min(list);
        System.out.println(min);

        //返回集合中的最大元素
        String max = Collections.max(list);
        System.out.println(max);
        //替换集合中的所有旧元素为新元素
        Collections.replaceAll(list,"ccc","xxx");
        System.out.println(list);
        //查找list2在list中第一次出现的位置
        int i = Collections.indexOfSubList(list, list2);
        System.out.println(i);
        //查找元素在集合中出现的次数
        int n = Collections.frequency(list, "ccc");
        System.out.println(n);

        list.addAll(list2);
        System.out.println(list);
//        全部元素替换
        Collections.fill(list,"o");
        System.out.println(list);

    }
}
