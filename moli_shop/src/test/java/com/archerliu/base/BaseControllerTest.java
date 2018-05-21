package com.archerliu.base;

import com.archerliu.MoliShopApplication;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by IntelliJ IDEA
 * DESC:
 * Author: archerliu
 * date: 2018/5/15 11:26
 **/
@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MoliShopApplication.class)
public class BaseControllerTest<T> {
    @Autowired
    private T controller;

    protected MockMvc mvc;

    private TestContextManager tcm;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        this.tcm = new TestContextManager(getClass());
        this.tcm.prepareTestInstance(this);
        this.mvc = MockMvcBuilders.standaloneSetup(controller).build();
    }
}
