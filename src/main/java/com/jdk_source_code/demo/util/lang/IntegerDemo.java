package com.jdk_source_code.demo.util.lang;

/**
 * @author lilin
 * @date 2019-09-29
 */
public class IntegerDemo {
    public static void main(String[] args) {
      Integer i1 = 10;
      Integer i2 = 10;
      System.out.println(i1==i2);
      Integer i3 = 1000;
      Integer i4 = 1000;
      System.out.println(i3==i4);
      Integer i5 = new Integer(1000);
      Integer i6 = new Integer(1000);
      System.out.println(i5==i6);
    }
}
