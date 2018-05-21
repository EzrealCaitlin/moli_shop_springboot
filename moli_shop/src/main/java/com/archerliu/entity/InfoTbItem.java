package com.archerliu.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA
 * DESC: 商品信息
 * Author: archerliu
 * date: 2018/5/14 15:16
 **/
@TableName("info_tb_item")
public class InfoTbItem extends Model<InfoTbItem> {

    private Integer id;
    private String name;
    private String title;
    private Float price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
