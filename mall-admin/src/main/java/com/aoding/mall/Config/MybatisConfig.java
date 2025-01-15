package com.aoding.mall.Config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.aoding.mall.mapper","com.aoding.mall.dao"})
public class MybatisConfig {
}
