package com.jdk_source_code.demo.util;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lilin
 * @date 2019-09-18
 * 该类主要分析object类的方法的使用
 */
@Data
public class ObjectDemo implements Cloneable{
    private String name;
    private Integer age;
    public ObjectDemo(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public static void testClone() throws CloneNotSupportedException {
        ObjectDemo objectDemo1 = new ObjectDemo("王二",26);
        System.out.println("使用clone前的age："+objectDemo1.getAge());
        ObjectDemo objectDemo2 = (ObjectDemo) objectDemo1.clone();
        objectDemo2.setAge(18);
        System.out.println("使用clone后的age:"+objectDemo1.getAge());

    }


    public static void testGetclass(){
        ObjectDemo objectDemo = new ObjectDemo("王二",26);
        Class<? extends ObjectDemo> clazz = objectDemo.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz.getDeclaredFields());
        System.out.println(clazz.getDeclaredMethods());

    }

    public static void testEquals(){
        Integer c = new Integer(10);
        Integer d = new Integer(10);
        System.out.println(c.equals(d));
        BigDecimal e = new BigDecimal(0.89);
        BigDecimal f = new BigDecimal(0.89);
        System.out.println(e.equals(f));
    }

    public static void testHashcode(){
        String str = "gert435";
        System.out.println(str.hashCode());
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        testClone();
        testGetclass();
        testEquals();
        testHashcode();

    }
}

