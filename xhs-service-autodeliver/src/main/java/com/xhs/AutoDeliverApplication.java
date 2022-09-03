package com.xhs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 陈款
 * @since 2022/9/3
 */
@SpringBootApplication
public class AutoDeliverApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoDeliverApplication.class,args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
