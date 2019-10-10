package com.jdk_source_code.demo.util.lang;

import com.alibaba.fastjson.JSONObject;

/**
 * @author lilin
 * @date 2019-20-10
 */
public class SystemDemo {

    public static void main(String[] args) {
        System.out.println("hello");
        System.err.println("err");
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.getenv());
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.home"));

        int[] i1 = {11,22,33};
        int[] i2 = {44,55,66};
        System.arraycopy(i1,0,i2,0,2);
        System.out.println(JSONObject.toJSONString(i2));

    }
}
