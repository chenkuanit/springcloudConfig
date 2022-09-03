package com.xhs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author 陈款
 * @since 2022/9/3
 */
@SpringBootApplication
@EntityScan("com.xhs.pojo")
public class XhsResumeApplication8080 {
    public static void main(String[] args) {
        SpringApplication.run(XhsResumeApplication8080.class,args);
    }
}
