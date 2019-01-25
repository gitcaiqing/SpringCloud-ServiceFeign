package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients表明自己是Feign消费者端
@EnableFeignClients
public class SpringCloudServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceFeignApplication.class, args);
	}

}

