package com.archerliu.service;

import com.archerliu.MoliShopApplication;
import com.archerliu.dao.InfoTbItemMapper;
import com.archerliu.entity.InfoTbItem;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA
 * DESC:
 * Author: archerliu
 * date: 2018/5/15 11:29
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MoliShopApplication.class)
public class InfoTbItemServiceTest {
    @Resource
    private InfoTbItemService itemService;

    @Test
    public void testGetPageData(){
        Page<InfoTbItem> page = new Page<>();
        page.setSize(10);
        page.setCurrent(1);
        itemService.getPageData(page);
        System.out.println(page.toString());
        Assert.assertTrue(page.getRecords() != null);
    }
}
