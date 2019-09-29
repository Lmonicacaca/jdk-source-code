package com.jdk_source_code.demo.util;

/**
 * @author lilin
 * @date 2019-09-29
 */
public class DoubleDemo {


    public static void main(String[] args) {
        String s = "gre";
        try{
            Double value = Double.valueOf(s);
        }catch (NumberFormatException e){
            System.out.println("转换字符串不是数值");
        }



    }
}
