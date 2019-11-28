package com.jdk_source_code.demo.util.util.concurrent;

import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lilin
 * @date 2019-11-26
 */
@Component
public class ThreadPoolExecutorDemo {

    private ExecutorService executorService = new ThreadPoolExecutor(2,10,60, TimeUnit.MINUTES,new LinkedBlockingDeque<>());

    public class DemoThread implements Runnable{

        @Override
        public void run() {
            int sum = 0;
            for(int i=0;i<1000;i++){
                sum = sum+i;
            }
            System.out.println(Thread.currentThread().getName()+"正在处理处理业务逻辑");
        }
    }


    public void doexecute(){
        executorService.execute(new DemoThread());
    }

}
