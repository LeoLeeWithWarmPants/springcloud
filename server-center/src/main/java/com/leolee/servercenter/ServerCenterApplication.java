package com.leolee.servercenter;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerCenterApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerCenterApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

}
