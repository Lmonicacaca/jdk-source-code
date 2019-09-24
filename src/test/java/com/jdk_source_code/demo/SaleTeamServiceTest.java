package com.jdk_source_code.demo;

import com.jdk_source_code.demo.service.SaleTeamService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class SaleTeamServiceTest {
    @Autowired
    private SaleTeamService saleTeamService;

    @Test
    public void testGetSaleTeam(){
        System.out.println(saleTeamService.getSaleTeamInfoById(12777058));
    }
}
