package com.archerliu.base.init;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA
 * DESC: 项目启动时初始化设置类
 * Author: archerliu
 * date: 2018/5/15 16:10
 **/
@Component
public class MyApplicationInit implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //此处可以添加项目初始化设置代码
    }
}
