package com.synpulse.ebanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//开启eureka服务 服务端的启动类,可以接受别人注册进来
public class EurekaApplication {


        public static void main(String[] args) {
            SpringApplication.run(EurekaApplication.class,args);
        }
}
