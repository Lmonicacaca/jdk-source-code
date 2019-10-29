package com.jdk_source_code.demo.util.util;

import java.util.*;

/**
 * @author lilin
 * @date 2019-10-10
 */
public class ArrayListDemo {

    public static void main(String[] args) {
       List list = new ArrayList();
       list.add("aaa");
       list.add(1);
       list.add(2);
       list.add(null);
       list.add(null);
       list.add("aaa");
       System.out.println(list);
       System.out.println(list.contains(1));
       System.out.println(list.indexOf(78));
       System.out.println(list.get(1));
       System.out.println(list.remove("aaa"));
       System.out.println(list);
        System.out.println(list.subList(0,2));

    }
}
