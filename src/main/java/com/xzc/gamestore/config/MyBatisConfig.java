package com.xzc.gamestore.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xzc
 * @date 2025/7/4 21 43:10
 * @description
 */
@Configuration
@MapperScan({"com.xzc.gamestore.mbg.mapper","com.xzc.gamestore.dao"})
public class MyBatisConfig {
}

