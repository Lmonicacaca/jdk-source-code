package com.jdk_source_code.demo.util;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lilin
 * @date 2019-10-09
 */
public class ClassDemo {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.jdk_source_code.demo.util.StringDemo");
            System.out.println(clazz.getName());//com.jdk_source_code.demo.util.StringDemo
            System.out.println(clazz.getSimpleName());//StringDemo
            Method method = clazz.getDeclaredMethod("judgeUserIdentity", String.class);
            method.invoke(clazz.newInstance(),"COPPER");//COPPER
            System.out.println(clazz.isInterface());//false
            System.out.println(clazz.isAnnotation());//false
            Method[] methods = clazz.getDeclaredMethods();
            for(Method item:methods){
                System.out.println(item);
            }
            /**
             * public void com.jdk_source_code.demo.util.StringDemo.judgeUserIdentity(java.lang.String)
             * public static void com.jdk_source_code.demo.util.StringDemo.testIsEmpty()
             * public void com.jdk_source_code.demo.util.StringDemo.doSomething0()
             * public void com.jdk_source_code.demo.util.StringDemo.doSomething1()
             * public void com.jdk_source_code.demo.util.StringDemo.doSomething2()
             * public static void com.jdk_source_code.demo.util.StringDemo.testCompare()
             * public void com.jdk_source_code.demo.util.StringDemo.doSomething3()
             * public void com.jdk_source_code.demo.util.StringDemo.doSomething4()
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
