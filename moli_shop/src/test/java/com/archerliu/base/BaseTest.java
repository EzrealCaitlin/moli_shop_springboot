package com.archerliu.base;

import com.archerliu.MoliShopApplication;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA
 * DESC:
 * Author: archerliu
 * date: 2018/5/15 10:02
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MoliShopApplication.class)
@WebAppConfiguration
public abstract class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

    protected MockMvc mockMvc;
    /**
     *  注入web环境的ApplicationContext容器
     */
    @Autowired
    protected WebApplicationContext wac;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
}
