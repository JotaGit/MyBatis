package com.github.jotagit.mybatis.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableWebMvc //Se meto esta anotacion, tengo que poner las paginas en las carpetas del SpringBoot //Si lo pongo no identifica las carpetas estaticas
//@EnableAutoConfiguration
@ComponentScan(basePackages={"com.github.jotagit.mybatis.controller"})
public class ConfigMVC {

	
}
