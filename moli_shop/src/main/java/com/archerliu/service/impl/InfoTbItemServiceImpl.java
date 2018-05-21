package com.archerliu.service.impl;

import com.archerliu.dao.InfoTbItemMapper;
import com.archerliu.entity.InfoTbItem;
import com.archerliu.service.InfoTbItemService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * DESC: 商品信息业务处理类
 * Author: archerliu
 * date: 2018/5/14 15:29
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class InfoTbItemServiceImpl extends ServiceImpl<InfoTbItemMapper, InfoTbItem> implements InfoTbItemService {
    @Autowired
    private InfoTbItemMapper itemMapper;

    @Override
    @Cacheable(value = "itemPageData", key = "'itemPageData'")
    public Page<InfoTbItem> getPageData(Page<InfoTbItem> page) {
        List<InfoTbItem> list = itemMapper.selectPage(page, new EntityWrapper<InfoTbItem>());
        page.setRecords(list);
        return page;
    }
}
