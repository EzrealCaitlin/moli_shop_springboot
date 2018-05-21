package com.archerliu.controller;

import com.archerliu.entity.InfoTbItem;
import com.archerliu.service.InfoTbItemService;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA
 * DESC:
 * Author: archerliu
 * date: 2018/5/14 15:35
 **/
@RestController
@RequestMapping("/item")
public class InfoTbItemController {
    @Autowired
    private InfoTbItemService itemServer;

    @RequestMapping(value = "/getPageData", method = RequestMethod.GET)
    @ResponseBody
    public Page<InfoTbItem> getPageData(@RequestParam int size,@RequestParam int current){
        Page<InfoTbItem> page = new Page<>();
        page.setCurrent(current);
        page.setSize(size);
        return itemServer.getPageData(page);
    }
}
