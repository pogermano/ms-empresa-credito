package com.w3g.msapigatwayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class MsApiGatwayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsApiGatwayZuulApplication.class, args);
	}

}
