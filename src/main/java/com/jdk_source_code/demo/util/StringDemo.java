package com.jdk_source_code.demo.util;

import java.util.Arrays;

/**
 * @author lilin
 * @date 2019-09-19
 * 详解String类
 */
public class StringDemo {

    public static void testIsEmpty(){
        String str = "fr";
        System.out.println(str.isEmpty());
    }

    public static void testCompare(){
        String str = "1ABc23";
        System.out.println("123".equals(str));
        System.out.println(str.startsWith("1"));
        System.out.println(str.endsWith("23"));
        System.out.println(str.equalsIgnoreCase("1abc23"));
    }


    public static void main(String[] args) {
        testIsEmpty();
        testCompare();
        String s = "143";
        char[] chars = s.toCharArray();
        System.out.println(chars.length);
        chars = Arrays.copyOf(s.toCharArray(), 10);
        System.out.println(chars.length);

    }
}
