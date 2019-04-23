package com.github.jotagit.mybatis.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages={"com.github.jotagit.mybatis.service", "com.github.jotagit.mybatis.component"})
public class ConfigCore {


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
	
}
