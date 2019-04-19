package com.github.jotagit.mybatis.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//@EnableWebMvc //Se meto esta anotacion, tengo que poner las paginas en las carpetas del SpringBoot //Si lo pongo no identifica las carpetas estaticas
//@EnableAutoConfiguration
@ComponentScan(basePackages={"com.github.jotagit.mybatis.controller"})
public class ConfigMVC {

	
}
