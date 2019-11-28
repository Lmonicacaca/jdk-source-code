package com.jdk_source_code.demo.util.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.List;

/**
 * @author lilin
 * @date 2019-11-28
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] a = {14,2,37,12};
        Arrays.sort(a);
        System.out.println(JSONObject.toJSONString(a));

        //int long short char byte float double
        Arrays.sort(a,0,2);
        System.out.println(JSONObject.toJSONString(a));

        //并行排序方法，在数据量大的时候速度快
        Arrays.parallelSort(a);
        System.out.println(JSONObject.toJSONString(a));

        //二分查找元素下标
        int i = Arrays.binarySearch(a, 2);
        System.out.println(i);

        int[] b = new int[]{14,2,37,12};
        boolean equals = Arrays.equals(a, b);
        System.out.println(equals);

        Arrays.fill(a,1);
        System.out.println(JSONObject.toJSONString(a));
        Arrays.fill(a,0,2,1);
        System.out.println(JSONObject.toJSONString(a));

        //扩容
        a = Arrays.copyOf(a,9);
        System.out.println(a.length);

        String[] str = new String[]{"111","222","333"};
        List<String> list = Arrays.asList(str);
        System.out.println(JSONObject.toJSONString(list));

        String s = Arrays.toString(a);
        System.out.println(s);

    }
}
