package com.archerliu.service;

import com.archerliu.entity.InfoTbItem;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

/**
 * Created by IntelliJ IDEA
 * DESC: 商品信息业务接口
 * Author: archerliu
 * date: 2018/5/14 15:22
 **/
public interface InfoTbItemService extends IService<InfoTbItem> {
    Page<InfoTbItem> getPageData(Page<InfoTbItem> page);
}
