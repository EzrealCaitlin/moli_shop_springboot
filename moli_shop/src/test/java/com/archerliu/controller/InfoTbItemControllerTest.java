package com.archerliu.controller;

import com.archerliu.MoliShopApplication;
import com.archerliu.base.BaseTest;
import net.sf.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by IntelliJ IDEA
 * DESC:
 * Author: archerliu
 * date: 2018/5/15 11:43
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MoliShopApplication.class)
@WebAppConfiguration
public class InfoTbItemControllerTest extends BaseTest {

    @Test
    public void testGetPageData() {
        try {
            String data = "{\"current\":1,\"size\":10}";

            MvcResult result = mockMvc.perform(post("item/getPageData").contentType(MediaType.APPLICATION_JSON).content(data).accept(MediaType.APPLICATION_JSON)).andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8)).andExpect(status().isOk()).andDo(print()).andReturn();
            String resultStr = result.getResponse().getContentAsString();
            JSONObject jsonObject = JSONObject.fromObject(resultStr);
            int status = (int) jsonObject.get("code");
            Assert.assertTrue(status == 0);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
