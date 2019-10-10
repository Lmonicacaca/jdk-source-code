package com.jdk_source_code.demo.util;

import java.util.Arrays;

/**
 * @author lilin
 * @date 2019-09-19
 * 详解String类
 */
public class StringDemo {
    private String name;

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

    public void judgeUserIdentity(String type){
        switch (EnumDemo.getValue(type)){
            case COPPER:
                doSomething0();break;
            case SILVER:
                doSomething1();break;
            case GOLD:
                doSomething2();break;
            case PLATINUM:
                doSomething3();break;
            case DIAMOND:
                doSomething4();break;
        }
    }
    public void doSomething0(){
        System.out.println("COPPER");
    }
    public void doSomething1(){
        System.out.println("SILVER");
    }
    public void doSomething2(){
        System.out.println("GOLD");
    }
    public void doSomething3(){
        System.out.println("PLATINUM");
    }
    public void doSomething4(){
        System.out.println("DIAMOND");
    }

}
