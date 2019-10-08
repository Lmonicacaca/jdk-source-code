package com.jdk_source_code.demo.util;

/**
 * @author lilin
 * @date 2019-10-08
 */
public class ThreadLocalDemo {
    private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public Integer getValue(){
        threadLocal.set(threadLocal.get()+1);
        return threadLocal.get();
    }

    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo(new ThreadLocalDemo());
        ThreadDemo thread2 = new ThreadDemo(new ThreadLocalDemo());
        ThreadDemo thread3 = new ThreadDemo(new ThreadLocalDemo());
        thread1.run();
        thread2.run();
        thread3.run();
    }

}

class ThreadDemo extends Thread{
    private ThreadLocalDemo threadLocalDemo;
    public ThreadDemo(ThreadLocalDemo threadLocalDemo){
        this.threadLocalDemo = threadLocalDemo;
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println(this.getName()+":"+this.threadLocalDemo.getValue());
        }
    }
}