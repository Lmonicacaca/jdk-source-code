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
            Method method = clazz.getDeclaredMethod("judgeUserIdentity", String.class);
            method.invoke(clazz.newInstance(),"COPPER");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
