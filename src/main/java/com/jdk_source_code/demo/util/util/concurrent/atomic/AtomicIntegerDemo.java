package com.jdk_source_code.demo.util.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lilin
 * @date 2019-12-23
 */
public class AtomicIntegerDemo extends Thread{

    public static AtomicInteger num = new AtomicInteger(0);

    public void addNum(){
        num.incrementAndGet();
    }
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            addNum();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerDemo atomicIntegerDemo1 =  new AtomicIntegerDemo();
        AtomicIntegerDemo atomicIntegerDemo2 =  new AtomicIntegerDemo();
        AtomicIntegerDemo atomicIntegerDemo3 =  new AtomicIntegerDemo();
        atomicIntegerDemo1.start();
        atomicIntegerDemo2.start();
        atomicIntegerDemo3.start();
        Thread.sleep(5000);
        System.out.println(num);
    }
}
