package com.jdk_source_code.demo;

import com.jdk_source_code.demo.util.util.ThreadPoolExecutorDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreadPoolExecuteDemoTest {

    @Autowired
    private ThreadPoolExecutorDemo threadPoolExecutorDemo;

    @Test
    public void testDoexecute(){
        for(int i=0;i<500;i++){
            threadPoolExecutorDemo.doexecute();
        }
    }
}
