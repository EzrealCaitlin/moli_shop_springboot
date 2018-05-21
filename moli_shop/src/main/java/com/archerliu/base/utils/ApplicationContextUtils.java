package com.archerliu.base.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA
 * DESC:
 * Author: archerliu
 * date: 2018/5/15 16:05
 **/
@Component
public class ApplicationContextUtils implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationContextUtils.class);

    private static ApplicationContext ac;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if(ac == null){
            ac = applicationContext;
        }
        logger.info("ApplicationContext初始化成功，可通过ApplicationContextUtils工具类获取");
    }

    public static ApplicationContext getApplicationContext(){
        return ac;
    }

    public static Object getBean(String beanName) throws BeansException{
        return ac.getBean(beanName);
    }

    public static <T> T getBean(Class<T> clazz){
        return ac.getBean(clazz);
    }
}
