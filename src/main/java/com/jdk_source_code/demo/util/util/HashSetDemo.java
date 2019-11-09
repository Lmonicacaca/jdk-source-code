package com.jdk_source_code.demo.util.util;


import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author lilin
 * @date 2019-11-09
 */
public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet();
        set1.add("hhh");
        set1.add("qqq");
        set1.add("www");
        set1.add("eee");
        set1.add("rrr");
        set1.add("ttt");
        System.out.println(JSONObject.toJSONString(set1));

        LinkedHashSet set2 = new LinkedHashSet();
        set2.add("hhh");
        set2.add("qqq");
        set2.add("www");
        set2.add("eee");
        set2.add("rrr");
        set2.add("ttt");
        System.out.println(JSONObject.toJSONString(set2));

        TreeSet<String> set3 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.compareTo(o2)<0){
                    return 1;
                }
                if(o1.compareTo(o2)>0){
                    return -1;
                }
                return 0;
            }
        });
        set3.add("hhh");
        set3.add("qqq");
        set3.add("www");
        set3.add("eee");
        set3.add("rrr");
        set3.add("ttt");
        System.out.println(JSONObject.toJSONString(set3));





    }
}
