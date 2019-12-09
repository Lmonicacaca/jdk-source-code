package com.jdk_source_code.demo.util.util;

import java.util.Random;

/**
 * @author lilin
 * @date 2019-12-09
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(20);
        System.out.println(i);
        double random1 = Math.random();
        System.out.println(random1);

    }
}
