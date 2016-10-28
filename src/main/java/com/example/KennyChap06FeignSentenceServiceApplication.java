package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

// Feign is used as alternative to RestTemplate
// Also allows you to write calls to REST services with no implementation code

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients // @EnableFeignClients will make Spring to scan for @FeignClient annotation and provides the implementation at runtime. In our example com.example.dao.Adjective has @FeignClients and other classes in dao package.
public class KennyChap06FeignSentenceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KennyChap06FeignSentenceServiceApplication.class, args);
	}
}
