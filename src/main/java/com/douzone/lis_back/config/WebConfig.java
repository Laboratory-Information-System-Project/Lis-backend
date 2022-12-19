package com.douzone.lis_back.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")
                .allowCredentials(true)
                .allowedMethods("GET,POST,PUT,OPTIONS,DELETE")
                .allowedHeaders("X-Requested-With, Content-Type, "
                        + "Authorization, Origin, Accept, Access-Control-Request-Method, Access-Control-Request-Headers" +
                        ", Access-Control-Allow-Methods, Access-Control-Allow-Origin, Access-Control-Allow-Credentials" +
                        ",Access-Control-Allow-Headers");
    }
}
