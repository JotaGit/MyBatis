package com.github.jotagit.mybatis.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.github.mybatis.mybatis.repository", "com.github.jotagit.mybatis.entity"})
@MapperScan(basePackages = "com.github.jotagit.mybatis.repository")
public class ConfigData {


}
