package com.jdk_source_code.demo;

import com.jdk_source_code.demo.domain.UserDO;
import com.jdk_source_code.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetUser(){
        System.out.println(userService.getUserDOById(-100));
    }
}
