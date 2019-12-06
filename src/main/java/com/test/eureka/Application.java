package com.test.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description Eureka注册中心
 * @author zhengchunfeng
 * @date 2019/12/6 13:57
 * @return
 **/
@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

}
