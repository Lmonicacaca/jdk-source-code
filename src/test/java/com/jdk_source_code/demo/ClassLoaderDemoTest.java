package com.jdk_source_code.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassLoaderDemoTest {

    @Test
    public void testClassLoaderDemo(){
        try {
            Class clazz = Class.forName("com.jdk_source_code.demo.util.ClassLoaderDemo");
            System.out.println("########以下是采用类加载类加载类########");
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            systemClassLoader.loadClass("com.jdk_source_code.demo.util.ClassLoaderDemo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
