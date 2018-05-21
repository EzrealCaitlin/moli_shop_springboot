package com.archerliu;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@MapperScan("com.archerliu.dao")
@EnableCaching
public class MoliShopApplication {

    private static final Logger logger = LoggerFactory.getLogger(MoliShopApplication.class);

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(MoliShopApplication.class, args);
        long time = System.currentTimeMillis() - start;
        logger.info("项目已启动完成，共用时{}毫秒", time);
    }
}
